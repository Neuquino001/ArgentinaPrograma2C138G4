package com.grupoutn.tpintegrador;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Cliente extends Persona{
    @Column
    private String razonSocial;
    private String cuit;
 
    private Set<Servicio> listaServicios;
    
    public Cliente(String razonSocial, String cuit, String dni, String nombre, String apellido, String domicilio, LocalDate fechaDeNacimiento) {
        super(dni, nombre, apellido, domicilio, fechaDeNacimiento);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "CLIENTE\n"+super.toString()+"Razon social: "+this.getRazonSocial()+"CUIT: "+this.getCuit();
    }
    

    

    
    
    
}
