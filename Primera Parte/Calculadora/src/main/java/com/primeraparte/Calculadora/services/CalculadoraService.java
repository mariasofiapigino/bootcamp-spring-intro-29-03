package com.primeraparte.Calculadora.services;

import com.primeraparte.Calculadora.dtos.CasaDTO;
import com.primeraparte.Calculadora.dtos.HabitacionDTO;

import java.util.List;

public class CalculadoraService {

    public static Double calcularArea(CasaDTO casaDTO){
        return casaDTO.calcularArea();
    }

    public static Double calcularValor(CasaDTO casa) {
        return casa.calcularValor();
    }

    public static HabitacionDTO obtenerMayor(CasaDTO casa){
        return casa.obtenerMayor();
    }

    public static List<HabitacionDTO> calcularAreaHabitacion(CasaDTO casa) {
        casa.calcularArea();
        return casa.getHabitaciones();
    }
}
