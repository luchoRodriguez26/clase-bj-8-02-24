package com.bootcamp.clase8feb.controllers;

import com.bootcamp.clase8feb.dto.response.PacienteDTO;
import com.bootcamp.clase8feb.dto.response.SintomasDTO;
import com.bootcamp.clase8feb.model.Paciente;
import com.bootcamp.clase8feb.model.Sintoma;
import com.bootcamp.clase8feb.repositories.PacienteRepositorio;
import com.bootcamp.clase8feb.repositories.SintomaRepositorio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SintomasController {

    @GetMapping("/findSymptom")
    public ResponseEntity<List<SintomasDTO>> getAllSintomas () {
        List<SintomasDTO> sintomasDTO = new ArrayList<>();
        SintomaRepositorio.getInsance().getSintomas().forEach(s -> {
            sintomasDTO.add(new SintomasDTO(s.getNombre(), s.getNivel_gravedad()));
        });
        return ResponseEntity.ok().body(sintomasDTO);
    }

    @GetMapping("/findSymptom/{name}")
    public ResponseEntity<SintomasDTO> findSintoma (@PathVariable String name) {
        Optional<Sintoma> sintomaBuscado =  SintomaRepositorio.getInsance().getSintomas()
                .stream()
                .filter(s -> s.getNombre().equals(name))
                .findFirst();
        return (sintomaBuscado.isEmpty()) ? ResponseEntity.badRequest().body(null)
                : ResponseEntity.ok(new SintomasDTO(sintomaBuscado.get().getNombre(), sintomaBuscado.get().getNivel_gravedad()));
    }

    @GetMapping("/findRiskPerson")
    public ResponseEntity<List<PacienteDTO>> findPersonasDeRiesgo () {
        List<PacienteDTO> pacientesDto = new ArrayList<>();
        PacienteRepositorio.getInsance().getPacientes().forEach(p -> {
            PacienteDTO paciente = new PacienteDTO(p.getNombre(), p.getApellido());
            p.getSintomas().forEach(s -> {
                paciente.getSintomas().add(new SintomasDTO(s.getNombre(), s.getNivel_gravedad()));
            });
            pacientesDto.add(paciente);
        });
        return ResponseEntity.ok(pacientesDto);
    }



}
