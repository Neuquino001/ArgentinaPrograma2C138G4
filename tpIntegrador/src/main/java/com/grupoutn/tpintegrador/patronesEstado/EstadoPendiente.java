/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupoutn.tpintegrador.patronesEstado;

public class EstadoPendiente implements EstadoIncidente {
    
        @Override
    public void notificar() {
        System.out.println("Pendiente");
    }
}
