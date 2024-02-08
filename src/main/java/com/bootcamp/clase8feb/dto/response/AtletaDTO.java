package com.bootcamp.clase8feb.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AtletaDTO {
    String nombre;
    String apellido;
    String deporte_realizado;
}
