package com.grupoutn.tpintegrador;
import java.time.LocalDate;
import java.time.Month;
import lombok.Data;

@Data
public class TpIntegrador {

    public static void main(String[] args) {
        //String razonSocial, String cuit, int dni, String nombre, String apellido, String domicilio, LocalDate fechaDeNacimiento
        
        Cliente cliente1 = new Cliente("Pami","20-29951697-1",29951697,"Carlos","Rial","Itapiru 2620",LocalDate.of(1982, 8, 10));
        System.out.println(cliente1.toString());
        System.out.println("\n-----------------------------------------\n");
        //int celular, String mail, String diasDisponibles, boolean aceptacion, String clasificacion, boolean activo, int dni, String nombre, String apellido, String domicilio, LocalDate fechaDeNacimiento
        Tecnico tecn1 = new Tecnico(1133569874,"bdr@gmail.com","Jueves y Sabados",true,"Dificil",true,35698741,"Jose","Morales","San Juan 1254",LocalDate.of(1995,4, 16));
        System.out.println(tecn1.toString());
        
    }
}
