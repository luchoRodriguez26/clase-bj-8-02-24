package com.bootcamp.clase8feb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

@RestController
public class EjercicioUnoController {


    @GetMapping("{day}/{month}/{year}")
    public int calcularEdad (@PathVariable int day,
                             @PathVariable int month,
                             @PathVariable int year) {
        int yearA = LocalDateTime.now().getYear();
        int monthA = LocalDateTime.now().getMonthValue();
        int dayA = LocalDateTime.now().getDayOfMonth();

        int difYears = yearA - year; // lo que cumple este año
        if ( (monthA < month) || (monthA == month && dayA < day) ) return difYears - 1;
        return difYears;
    }
}
