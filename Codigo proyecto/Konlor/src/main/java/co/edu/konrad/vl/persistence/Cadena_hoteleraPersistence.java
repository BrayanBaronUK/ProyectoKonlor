/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.persistence;

import co.edu.konrad.vl.entities.Cadena_hoteleraEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Cesar chacon
 */
@Stateless
public class Cadena_hoteleraPersistence {

    //por cada tabla habra un controller
    @PersistenceContext(unitName = "com.konrad.edu.co_Konlor_war_1.0-SNAPSHOTPU")
    protected EntityManager em;

    //select * from la tabla
    public List<Cadena_hoteleraEntity> findAll() {
        Query todos = em.createQuery("select e from Cadena_hoteleraEntity e");
        return todos.getResultList();
    }

    //obtiene un curso por su id , por consulta en persistence
    public Cadena_hoteleraEntity find(Long id) {
        Cadena_hoteleraEntity es = em.find(Cadena_hoteleraEntity.class, id);
        return es;
    }

    //insert de datos  metodo persist no retorna
    public Cadena_hoteleraEntity create(Cadena_hoteleraEntity createCadena) {
        em.persist(createCadena);
        return createCadena;

    }

    //actualizar datos , merge si retorna el objeto
    public Cadena_hoteleraEntity update(Cadena_hoteleraEntity actualizarCadena) {
        return em.merge(actualizarCadena);

    }

    public void delete(Long id) {
        Cadena_hoteleraEntity BorrarCadena = em.find(Cadena_hoteleraEntity.class, id);
        em.remove(BorrarCadena);
    }

    public List<Cadena_hoteleraEntity> findByName(String nombreEst) {

        TypedQuery<Cadena_hoteleraEntity> cadenaH = em.createNamedQuery("Cadena_hotelera.findByName", Cadena_hoteleraEntity.class).setParameter("nombre", nombreEst);
        return cadenaH.getResultList();
    }
}
