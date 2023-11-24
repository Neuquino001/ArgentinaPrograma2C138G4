package com.grupoutn.tpintegrador.gestores;

import com.grupoutn.tpintegrador.Servicio;
import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Data
public class PersistenciaServicio {
    @PersistenceContext
    private EntityManager em;

    public Servicio buscarUna(int numero) {
        return em.find(Servicio.class, numero);
    }
    public List<Servicio> buscarServicios(){
        return em.createQuery("select e from Servicio e", Servicio.class).getResultList();
    }
    public void insertar(Servicio servicio) {
        em.persist(servicio);
    }
    public void actualizar(Servicio servicio) {
        em.merge(servicio);
    }
}
