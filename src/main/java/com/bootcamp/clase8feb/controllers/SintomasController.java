package com.bootcamp.clase8feb.controllers;

import com.bootcamp.clase8feb.dto.response.SintomasDTO;
import com.bootcamp.clase8feb.model.Sintoma;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SintomasController {
    private List<Sintoma> sintomas = new ArrayList<>();

    @GetMapping("/findSymptom")
    public ResponseEntity<SintomasDTO> getAllSintomas () {
        return new ResponseEntity<>(new SintomasDTO(), HttpStatus.OK);
    }

    @GetMapping("/findSymptom/{name}")
    public ResponseEntity<SintomasDTO> findSintoma (@PathVariable String name) {
        return new ResponseEntity<>(new SintomasDTO(), HttpStatus.OK);
    }

    @GetMapping("/findRiskPerson")
    public ResponseEntity<SintomasDTO> findPersonasDeRiesgo () {
        return new ResponseEntity<>(new SintomasDTO(), HttpStatus.OK);
    }



}
