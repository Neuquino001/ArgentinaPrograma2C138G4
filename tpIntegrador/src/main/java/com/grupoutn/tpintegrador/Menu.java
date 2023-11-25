/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupoutn.tpintegrador;

/**
 *
 * @author Gustavo
 */

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Menu {
    
     public void MenuPrincipal() {
        
        Scanner scanner = new Scanner(System.in);
//        Menu menu = new Menu();

        int opcion;
        do {
            
            System.out.println("===== Menú Principal =====");
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Técnicos");
            System.out.println("3. Gestionar Especialidades");
            System.out.println("4. Gestionar Incidentes");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Clientes");
                    // Lógica para gestionar clientes
                    MenuClientes();
                    break;
                case 2:
                    System.out.println("Gestionar Técnicos");
                    // Lógica para gestionar técnicos
                    MenuTecnicos();
                    break;
                case 3:
                    System.out.println("Gestionar Especialidades");
                    // Lógica para gestionar especialidades
                    MenuEspecialidades();
                    break;
                case 4:
                    System.out.println("Gestionar Incidentes");
                    // Lógica para gestionar incidentes
                    MenuIncidentes();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
     
    }
     
    public void MenuClientes() {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("===== Menú Clientes =====");
            System.out.println("1. Gestionar Altas");
            System.out.println("2. Gestionar Bajas");
            System.out.println("3. Gestionar Modificaciones");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Altas");
                    // Lógica para gestionar clientes
                    break;
                case 2:
                    System.out.println("Gestionar Bajas");
                    // Lógica para gestionar técnicos
                    break;
                case 3:
                    System.out.println("Gestionar Modificaciones");
                    // Lógica para gestionar especialidades
                    break;
                case 4:
                    System.out.println("Mostrar Clientes");
                    // Lógica para gestionar especialidades
                    break;
                    
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }
    
    public void MenuTecnicos() {
        
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("===== Menú Tecnicos =====");
            System.out.println("1. Gestionar Altas");
            System.out.println("2. Gestionar Bajas");
            System.out.println("3. Gestionar Modificaciones");
            System.out.println("4. Mostrar Tecnicos");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Altas");
                    // Lógica para gestionar clientes
                    break;
                case 2:
                    System.out.println("Gestionar Bajas");
                    // Lógica para gestionar técnicos
                    break;
                case 3:
                    System.out.println("Gestionar Modificaciones");
                    // Lógica para gestionar especialidades
                    break;
                case 4:
                    System.out.println("Mostrar Tecnicos");
                    // Lógica para gestionar especialidades
                    break;
                
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
        
    }
    
     public void MenuIncidentes() {
         
         
         
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("===== Menú Incidentes =====");
            System.out.println("1. Gestionar Altas");
            System.out.println("2. Gestionar Bajas");
            System.out.println("3. Gestionar Modificaciones");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Altas");
                    // Lógica para gestionar clientes
                    break;
                case 2:
                    System.out.println("Gestionar Bajas");
                    // Lógica para gestionar técnicos
                    break;
                case 3:
                    System.out.println("Gestionar Modificaciones");
                    // Lógica para gestionar especialidades
                    break;
                
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
        
    }
    
    public void MenuEspecialidades() {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("===== Menú Especialidades =====");
            System.out.println("1. Gestionar Altas");
            System.out.println("2. Gestionar Bajas");
            System.out.println("3. Gestionar Modificaciones");
            System.out.println("5. Salir");
            System.out.println("==========================");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Gestionar Altas");
                    // Lógica para gestionar clientes
                    break;
                case 2:
                    System.out.println("Gestionar Bajas");
                    // Lógica para gestionar técnicos
                    break;
                case 3:
                    System.out.println("Gestionar Modificaciones");
                    // Lógica para gestionar especialidades
                    break;
                
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
        
    }
    
    
}