package com.github.fabiohnardella.api.seguros.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auto")
public class AutoController {

    @GetMapping
    public String getAuto() {
        return "Retornando lista de produtos do seguro de Automotivos....";
    }

    @GetMapping("/simples")
    public String getAutoSimples() {
        return "Retornando plano de seguro automotivo SIMPLES";
    }
}
