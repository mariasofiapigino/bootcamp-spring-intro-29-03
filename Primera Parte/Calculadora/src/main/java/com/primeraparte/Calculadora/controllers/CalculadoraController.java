package com.primeraparte.Calculadora.controllers;

import com.primeraparte.Calculadora.dtos.CasaDTO;
import com.primeraparte.Calculadora.services.CalculadoraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @PostMapping("/area")
    public ResponseEntity<Double> calcularArea(@RequestBody CasaDTO casa){
        return new ResponseEntity(CalculadoraService.calcularArea(casa), HttpStatus.OK);
    }

    @PostMapping("/valor")
    public ResponseEntity<Double> calcularValor(@RequestBody CasaDTO casa){
        return new ResponseEntity(CalculadoraService.calcularValor(casa), HttpStatus.OK);
    }

    @PostMapping("/mayor")
    public ResponseEntity<Double> obtenerMayor(@RequestBody CasaDTO casa){
        return new ResponseEntity(CalculadoraService.obtenerMayor(casa), HttpStatus.OK);
    }

    @PostMapping("/habitaciones")
    public ResponseEntity calcularAreaHabitacion(@RequestBody CasaDTO casa){
        return new ResponseEntity(CalculadoraService.calcularAreaHabitacion(casa), HttpStatus.OK);
    }

    // Para generar un unico JSON
    @PostMapping("/casa")
    public ResponseEntity calcularTodo(@RequestBody CasaDTO casa){
        CalculadoraService.calcularArea(casa);
        CalculadoraService.calcularValor(casa);
        CalculadoraService.obtenerMayor(casa);
        return new ResponseEntity(casa, HttpStatus.OK);
    }

}
