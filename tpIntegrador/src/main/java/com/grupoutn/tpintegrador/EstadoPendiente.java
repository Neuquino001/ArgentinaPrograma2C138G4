/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupoutn.tpintegrador;

public class EstadoPendiente extends EstadoIncidente {
    
        @Override
    public void notificar() {
        System.out.println("Pendiente");
    }
}
