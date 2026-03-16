package com.github.fabiohnardella.api.seguros.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/residencia")
public class ResidenciaController {

    @GetMapping
    public String getResidencia() {
        return "Retornando todos os seguros do tipo residencial...";
    }
}
