package com.grupoutn.tpintegrador;

import java.util.Set;
import lombok.Data;

@Data
class Especialidad {
    private int id;
    private String descripcion; 
    Set<Servicio> servicio;
}
