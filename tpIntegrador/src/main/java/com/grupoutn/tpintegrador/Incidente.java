package com.grupoutn.tpintegrador;

import java.util.Date;
import lombok.Data;

@Data
public class Incidente {
    double id;
    private Tecnico tecnicoAsignado;
    private Date fechaPosibleResolucion;
    private String descripcion;
    private Especialidad especialidad;
    private EstadoIncidente estado;
    
    public Incidente (){
        this.estado = new EstadoPendiente();
        
    }
}
