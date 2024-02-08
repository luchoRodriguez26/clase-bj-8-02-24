package com.bootcamp.clase8feb.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sintoma {
    Long codigo;
    String nombre;
    int nivel_gravedad;
}
