package com.clase.edad.controllers;

import com.clase.edad.services.EdadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdadController {

    @GetMapping("/{day}/{month}/{year}")
    public int buscar(@PathVariable int day, @PathVariable int month, @PathVariable int year){
        return EdadService.convertirEdad(day, month, year);
    }
}
