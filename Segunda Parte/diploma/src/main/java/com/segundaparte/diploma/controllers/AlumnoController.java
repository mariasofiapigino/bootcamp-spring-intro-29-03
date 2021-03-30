package com.segundaparte.diploma.controllers;

import com.segundaparte.diploma.dtos.AlumnoDTO;
import com.segundaparte.diploma.services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {
    @PostMapping("/alumno")
    public ResponseEntity calcularPromedio(@RequestBody AlumnoDTO alumno){
        return new ResponseEntity(AlumnoService.calcularPromedio(alumno), HttpStatus.OK);

    }
}
