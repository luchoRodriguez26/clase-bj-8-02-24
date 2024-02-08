package com.bootcamp.clase8feb.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Deporte {
    String nombre;
    int nivel;
    List<Persona> personasInscriptas = new ArrayList<>();
}
