package com.segundaparte.diploma.dtos;

import lombok.Data;

import java.util.List;

@Data
public class AlumnoDTO {
    private String nombre;
    private List<MateriaDTO> materias;

    public Double calcularPromedio(){
        Double total = 0.0;
        for (MateriaDTO materia:materias) {
            total += materia.getNota();
        }
        return total/materias.size();
    }
}
