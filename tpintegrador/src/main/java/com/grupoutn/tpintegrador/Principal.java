package com.grupoutn.tpintegrador;

import com.grupoutn.tpintegrador.gestores.AbmEspecialidad;
import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Scanner;
import javax.persistence.Persistence;

@Data
public class Principal {
    public static EntityManager getEntityManager(){
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aplicacion");
        EntityManager manager = fabrica.createEntityManager();
        return manager;
    }
    public static void main(String[] args) {
        EntityManager em = getEntityManager();
        AbmEspecialidad espe = new AbmEspecialidad();

        espe.getPe().setEm(em);

        Scanner scanner = new Scanner(System.in);
        espe.agregarEspecialidad(scanner);

    }
}

 