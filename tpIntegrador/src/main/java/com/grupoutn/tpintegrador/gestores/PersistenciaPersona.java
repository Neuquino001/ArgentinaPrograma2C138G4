package com.grupoutn.tpintegrador.gestores;

import com.grupoutn.tpintegrador.Cliente;
import com.grupoutn.tpintegrador.Persona;
import com.grupoutn.tpintegrador.Tecnico;
import lombok.Data;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Data
public class PersistenciaPersona {
    @PersistenceContext
    private EntityManager em;
    public List<Tecnico> buscarTecnicos() {

        return em.createQuery("select t from Tecnico t", Tecnico.class).getResultList();
    }
    public List<Cliente> buscarClientes() {

        return em.createQuery("select c from Cliente c", Cliente.class).getResultList();
    }
    public void insertar(Persona persona) {
        em.persist(persona);
    }

    public void actualizar(Persona persona) {
        em.merge(persona);
    }
}
