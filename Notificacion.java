/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package trabajo.practico.integrador.Notificaciones;


import trabajo.practico.integrador.Tecnicos.Tecnicos;

/**
 *
 * @author Gustavo
 */

public enum Notificacion {
    MAIL,
    WHATSAPP,
    TELEGRAM,
    SMS;
    
    private Tecnicos tecnico;

    @Override
    public String toString() {
        return "Notificacion{" + "tecnico=" + tecnico + '}';
    }

    private Notificacion() {
    }

  
    
}
