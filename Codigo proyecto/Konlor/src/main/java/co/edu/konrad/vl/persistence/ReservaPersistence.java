/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.persistence;

import co.edu.konrad.vl.entities.ReservaEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Cesar chacon
 */
@Stateless

public class ReservaPersistence {

    @PersistenceContext(unitName = "com.konrad.edu.co_Konlor_war_1.0-SNAPSHOTPU")
    protected EntityManager em; // que hacer la trasaccion

    /**
     * meotodo para obtener todos los elementos
     *
     * @return
     */
    public List<ReservaEntity> findAll() {
        Query todos = em.createQuery("select ec from ReservaEntity ec");
        return todos.getResultList();
    }

    /**
     * obtener un elemento a partir de su id
     *
     * @param id
     * @return elemento encontrado
     */
    public ReservaEntity find(Long id) {
        ReservaEntity findReserva = em.find(ReservaEntity.class, id);
        return findReserva;
    }

    /**
     * Crear un objeto de la entidad ReservaEntity
     *
     * @param createReserva
     * @return objeto creado
     */
    public ReservaEntity create(ReservaEntity createReserva) {
        em.persist(createReserva);
        return createReserva;
    }

    /**
     * Actualizar un objeto de la entidad ReservaEntity
     *
     * @param actualizarReserva
     * @return objeto actualizado
     */
    public ReservaEntity update(ReservaEntity actualizarReserva) {
        return em.merge(actualizarReserva);
    }

    /**
     * Eliminar un Objeto determinado de la entidad ReservaEntity
     *
     * @param id
     */
    public void delete(Long id) {
        ReservaEntity borrarReserva = em.find(ReservaEntity.class, id);
        em.remove(borrarReserva);
    }

}
