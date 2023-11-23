package com.grupoutn.tpintegrador;

import java.time.LocalDate;
import lombok.Data;

@Data
 @Entity
public class Persona {
    @Id
    private double dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDate fechaDeNacimiento;

    public Persona(int dni, String nombre, String apellido, String domicilio, LocalDate fechaDeNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    
}
