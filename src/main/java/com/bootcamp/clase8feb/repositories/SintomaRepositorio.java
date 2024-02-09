package com.bootcamp.clase8feb.repositories;

import com.bootcamp.clase8feb.model.Sintoma;
import lombok.Getter;

import java.util.List;

public class SintomaRepositorio {
    private static SintomaRepositorio instance;

    @Getter
    private List<Sintoma> sintomas;

    private SintomaRepositorio () {}

    public static SintomaRepositorio getInsance () {
        if (instance == null) instance = new SintomaRepositorio();
        return instance;
    }

}
