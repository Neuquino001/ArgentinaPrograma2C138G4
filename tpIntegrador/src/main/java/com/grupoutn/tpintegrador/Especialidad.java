package com.grupoutn.tpintegrador;

import java.util.Set;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "especialidad")
class Especialidad {
    @Id
    private long id;
    @Column
    private String descripcion;
    Set<Servicio> servicio;
}
