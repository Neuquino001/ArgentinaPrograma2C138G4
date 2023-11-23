package com.grupoutn.tpintegrador;

import java.time.LocalDate;
import java.util.Set;
import lombok.Data;

@Data
 
public class Cliente extends Persona{
    private String razonSocial;
    private String cuit;
 
    private Set<Servicio> listaServicios;
    
    public Cliente(String razonSocial, String cuit, int dni, String nombre, String apellido, String domicilio, LocalDate fechaDeNacimiento) {
        super(dni, nombre, apellido, domicilio, fechaDeNacimiento);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "CLIENTE\n"+super.toString()+"Razon social: "+this.getRazonSocial()+"CUIT: "+this.getCuit();
    }
    

    

    
    
    
}
