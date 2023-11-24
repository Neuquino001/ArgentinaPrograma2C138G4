package com.grupoutn.tpintegrador;

import com.grupoutn.tpintegrador.gestores.AbmPersona;
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
        Scanner scanner = new Scanner(System.in);

        AbmPersona per = new AbmPersona();
        per.getPe().setEm(em);
        per.agregarCliente(scanner);
        per.agregarTecnico(scanner);
        per.mostrarClientes();
        per.mostrarTecnicos();
    }
}

 