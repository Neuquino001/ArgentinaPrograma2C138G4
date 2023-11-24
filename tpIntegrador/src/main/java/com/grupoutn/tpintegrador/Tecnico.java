package com.grupoutn.tpintegrador;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Tecnico extends Persona{
    
    private int celular;
    private String mail;
    //private Set<Especialidad> listaEspecialidades;
    //private String diasDisponibles;
    //private boolean aceptacion;
    private String clasificacion;
   // private Set<Incidente> listaIncidentes;
    private boolean disponible;

    public Tecnico(int celular, String mail, String diasDisponibles, String clasificacion, String dni, String nombre, String apellido, String domicilio, LocalDate fechaDeNacimiento) {
        super(dni, nombre, apellido, domicilio, fechaDeNacimiento);
        this.celular = celular;
        this.mail = mail;
        //this.diasDisponibles = diasDisponibles;
        //this.aceptacion = aceptacion;
        this.clasificacion = clasificacion;
        this.disponible = true;
    }
    public String toString() {
       // return "TECNICO\n"+super.toString()+"Celular: "+this.getCelular()+"mail: "+this.getMail()+"Dias disponibles: "+this.getDiasDisponibles()+
       //         "aceptacion: "+this.isAceptacion()+"Clasificacion: "+this.getClasificacion()+"Activo: "+this.isActivo();
       return "TECNICO\n"+super.toString()+"Celular: "+this.getCelular()+"mail: "+this.getMail()+
              "Clasificacion: "+this.getClasificacion()+"Disponible: "+this.isDisponible();

    }
    
}


