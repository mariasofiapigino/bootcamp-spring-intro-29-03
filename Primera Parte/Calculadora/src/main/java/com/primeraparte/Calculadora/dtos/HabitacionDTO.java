package com.primeraparte.Calculadora.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionDTO {
    private String nombre;
    private Double ancho;
    private Double largo;
    private Double area;

    public Double calcularArea(){
        this.area = ancho * largo;
        return area;
    }
}
