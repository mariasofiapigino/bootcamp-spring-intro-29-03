package com.segundaparte.diploma.dtos;

import lombok.Data;

import java.util.List;

@Data
public class AlumnoDTO {
    private String nombre;
    private List<MateriaDTO> materias;
}
