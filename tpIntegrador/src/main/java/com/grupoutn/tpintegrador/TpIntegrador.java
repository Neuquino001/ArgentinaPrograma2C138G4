package com.grupoutn.tpintegrador;
 
import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Data
public class TpIntegrador {
    public static EntityManager getEntityManager(){
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aplicacion");
    }
    public static void main(String[] args) {
        EntityManager em = getEntityManager();
        
    }
}

 