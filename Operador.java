/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.integrador.Operador;

import java.util.Date;
import lombok.Data;
import trabajo.practico.integrador.Tecnicos.Tecnicos;

/**
 *
 * @author Gustavo
 */
@Data
public class Operador {
    private int id;
    private int tiempoEstimadoProblema;
    private int tiempoEstimadoResolucion;
    private String descripciondelProblema;
    private String tipodelProblema;
    private Date fechadeResolucion;
    private Tecnicos tecnico;

    public Operador(int tiempoEstimadoProblema, int tiempoEstimadoResolucion) {
        this.tiempoEstimadoProblema = tiempoEstimadoProblema;
        this.tiempoEstimadoResolucion = tiempoEstimadoResolucion;
    }
    
    
    
}
