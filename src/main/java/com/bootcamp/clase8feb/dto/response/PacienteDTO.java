package com.bootcamp.clase8feb.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PacienteDTO {
    String nombre;
    String apellido;
    List<SintomasDTO> sintomas;

    public PacienteDTO (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sintomas = new ArrayList<>();
    }

}
