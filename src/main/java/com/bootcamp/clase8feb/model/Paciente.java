package com.bootcamp.clase8feb.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Paciente {
    Long id;
    String nombre;
    String apellido;
    int edad;
    List<Sintoma> sintomas;
}
