package com.bootcamp.clase8feb.controllers;

import com.bootcamp.clase8feb.dto.response.DeportesDTO;
import com.bootcamp.clase8feb.dto.response.PersonasDTO;
import com.bootcamp.clase8feb.model.Deporte;
import com.bootcamp.clase8feb.model.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeportistasController {

    List<Deporte> deportes = List.of(new Deporte("futbol", 2, List.of(new Persona("Luciano", "Rodriguez", 21))),
            new Deporte("Hockey", 3, List.of(new Persona("Tomas", "Rodriguez", 18))));

    @GetMapping("/findSports")
    public ResponseEntity<DeportesDTO> getAllDeportes () {
        return new ResponseEntity<>(new DeportesDTO(deportes), HttpStatus.OK);
    }

    @GetMapping("/findSports/{name}")
    public ResponseEntity<DeportesDTO> findDeporte (@PathVariable String name) {
        System.out.println("El deporte buscado es: " + name);
        List<Deporte> deporteBuscado = deportes.stream().filter(d -> d.getNombre().equalsIgnoreCase(name)).toList();
        return new ResponseEntity<>(new DeportesDTO(deporteBuscado), HttpStatus.OK);
    }

    @GetMapping("/findSportsPersons")
    public ResponseEntity<PersonasDTO> getAllPersonas () {
        List<Persona> personas = deportes.stream().map(d -> d.getPersonasInscriptas()).flatMap(p -> p.stream()).toList();
        return new ResponseEntity<>(new PersonasDTO(personas), HttpStatus.OK);
    }




}
