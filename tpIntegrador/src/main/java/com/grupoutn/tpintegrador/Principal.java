package com.grupoutn.tpintegrador;

//agrego menu
import lombok.Data;

@Data
public class Principal {

    public static void main(String[] args) {
          
        Menu menu = new Menu();
        menu.MenuPrincipal();

    }
}

 