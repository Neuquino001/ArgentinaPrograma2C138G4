package com.grupoutn.tpintegrador;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="persona")
public class Tecnico extends Persona{
    
    private int celular;
    private String mail;
    //private Set<Especialidad> listaEspecialidades;
   // private Set<Incidente> listaIncidentes;
    private boolean disponible;

    public Tecnico(int celular, String mail, String dni, String nombre) {
        super(dni, nombre);
        this.celular = celular;
        this.mail = mail;
        this.disponible = true;
    }
    public String toString() {
       // return "TECNICO\n"+super.toString()+"Celular: "+this.getCelular()+"mail: "+this.getMail()+"Dias disponibles: "+this.getDiasDisponibles()+
       //         "aceptacion: "+this.isAceptacion()+"Clasificacion: "+this.getClasificacion()+"Activo: "+this.isActivo();
       return "TECNICO\n"+super.toString()+"Celular: "+this.getCelular()+"mail: "+this.getMail()+
              "Disponible: "+this.isDisponible();

    }
    public Tecnico(){    }
}


