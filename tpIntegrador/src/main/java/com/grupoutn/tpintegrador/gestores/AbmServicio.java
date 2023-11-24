package com.grupoutn.tpintegrador.gestores;

import com.grupoutn.tpintegrador.Servicio;
import lombok.Data;

import java.util.Scanner;

@Data
public class AbmServicio {
    private PersistenciaServicio pe;

    public AbmServicio() {
        this.pe = new PersistenciaServicio();
    }
    public void agregarServicio(Scanner scanner) {
        System.out.print("Ingrese el nombre del servicio: ");
        String nombre = scanner.next();

        Servicio servicio = new Servicio();
        servicio.setDescripcion(nombre);

        pe.getEm().getTransaction().begin();
        pe.insertar(servicio);
        pe.getEm().getTransaction().commit();

        System.out.println("Servicio agregada con éxito.\n");
    }
    public void mostrarServicios(){
        System.out.println("Servicios:");
        pe.buscarServicios().forEach(servicio -> System.out.println(servicio));
        System.out.println();
    }

}
