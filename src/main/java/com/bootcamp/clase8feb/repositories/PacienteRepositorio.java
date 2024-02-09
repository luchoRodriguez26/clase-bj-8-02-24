package com.bootcamp.clase8feb.repositories;

import com.bootcamp.clase8feb.model.Paciente;
import lombok.Getter;

import java.util.List;

public class PacienteRepositorio {
    private static PacienteRepositorio instance;

    @Getter
    private List<Paciente> pacientes;

    private PacienteRepositorio () {}

    public static PacienteRepositorio getInsance () {
        if (instance == null) instance = new PacienteRepositorio();
        return instance;
    }

}
