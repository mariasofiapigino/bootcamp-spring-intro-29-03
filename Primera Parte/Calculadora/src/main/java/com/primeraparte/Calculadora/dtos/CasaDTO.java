package com.primeraparte.Calculadora.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CasaDTO {
    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;
    private Double area;
    private Double valor;
    private HabitacionDTO mayor;

    public Double calcularArea(){
        double total = 0;
        for (HabitacionDTO habitacion:habitaciones) {
            total += habitacion.calcularArea();
        }
        this.area = total;
        return total;
    }

    public Double calcularValor(){
        if (area == null) valor = calcularArea();
        this.valor = area * 800;
        return valor;
    }

    public HabitacionDTO obtenerMayor(){
        calcularArea();
        double max = habitaciones.get(0).getArea();
        HabitacionDTO habitacionMax = habitaciones.get(0);
        for (HabitacionDTO habitacion:habitaciones) {
            if (max < habitacion.getArea()){
                max = area;
                habitacionMax = habitacion;
            }
        }
        this.mayor = habitacionMax;
        return habitacionMax;
    }
}
