package com.grupoutn.tpintegrador;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    private String descripcion;
    //Set<Servicio> servicio;

    public Especialidad() {
    }
}
