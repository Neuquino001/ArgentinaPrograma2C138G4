/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soporteOperativo;

import lombok.Data;

/**
 *
 * @author BANGHO
 */
@Data
public class Tecnicos {
    private String nombreCompleto;
    private int documento;
    private int nacimientoFecha;
    private String domicilio;
    private int telefono;
    private String mail;
    private  String especialidad;
    private String diasDisponibles;
    private boolean aceptacion;
    private String sistemaOperativo;
    private String clasificación;
}
