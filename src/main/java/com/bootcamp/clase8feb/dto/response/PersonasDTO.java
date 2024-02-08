package com.bootcamp.clase8feb.dto.response;

import com.bootcamp.clase8feb.model.Persona;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonasDTO {
    List<Persona> personas;
}
