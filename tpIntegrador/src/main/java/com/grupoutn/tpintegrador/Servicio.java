 
package com.grupoutn.tpintegrador;

import javax.persistence.*;

import lombok.Data;
 
@Data
@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column (name="nombre")
    String descripcion;

    public Servicio() {
    }

    public Servicio(String nombreServicio) {
        this.descripcion = nombreServicio;
    }

    @Override
    public String toString (){
        return "Nombre del Servicio: "+this.getDescripcion();
    }
}
