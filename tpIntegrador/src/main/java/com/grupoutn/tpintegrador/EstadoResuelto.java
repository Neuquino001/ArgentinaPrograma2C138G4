package com.grupoutn.tpintegrador;

public class EstadoResuelto extends EstadoIncidente {
    
        @Override
    public void notificar() {
        System.out.println("Resuelto");
    }
}
