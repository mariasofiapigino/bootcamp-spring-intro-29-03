package com.segundaparte.diploma.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MensajeDTO {
    private String mensaje;
    private Double promedio;
    private AlumnoDTO alumnoDTO;
}
