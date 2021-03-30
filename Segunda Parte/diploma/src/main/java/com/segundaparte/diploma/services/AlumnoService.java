package com.segundaparte.diploma.services;

import com.segundaparte.diploma.dtos.AlumnoDTO;
import com.segundaparte.diploma.dtos.MensajeDTO;

public class AlumnoService {

    public static MensajeDTO calcularPromedio(AlumnoDTO alumno){
        Double promedio = alumno.calcularPromedio();
        String mensaje = "Ha aprobado";
        if (promedio < 4) mensaje = "No aprobo";
        if (promedio > 9) mensaje = "Felicitaciones! Ha aprobado con sobresaliente";

        return new MensajeDTO(mensaje, promedio, alumno);
    }
}
