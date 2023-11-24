package com.grupoutn.tpintegrador.patronesEstado;

import com.grupoutn.tpintegrador.patronesEstado.EstadoIncidente;

public class EstadoResuelto implements EstadoIncidente {
    
        @Override
    public void notificar() {
        System.out.println("Resuelto");
    }
}
