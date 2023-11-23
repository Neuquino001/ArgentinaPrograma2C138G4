 
package com.grupoutn.tpintegrador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
 
@Data
@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    double id;
    @Column (name="nombre")
    String nombre;

    public Servicio() {
    }

    public Servicio(String nombreServicio) {
        this.nombre = nombreServicio;
    }

    @Override
    public String toString (){
        return "Nombre del Servicio: "+this.getNombre();
    }
}
