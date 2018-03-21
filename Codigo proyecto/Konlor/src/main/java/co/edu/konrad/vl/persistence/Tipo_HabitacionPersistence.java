/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.persistence;

import co.edu.konrad.vl.entities.Tipo_HabitacionEntity;
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
public class Tipo_HabitacionPersistence {

    @PersistenceContext(unitName = "com.konrad.edu.co_Konlor_war_1.0-SNAPSHOTPU")
    protected EntityManager em; // que hacer la trasaccion

    /**
     * meotodo para obtener todos los elementos
     *
     * @return
     */
    public List<Tipo_HabitacionEntity> findAll() {
        Query todos = em.createQuery("select ec from Tipo_HabitacionEntity ec");
        return todos.getResultList();
    }

    /**
     * obtener un elemento a partir de su id
     *
     * @param id
     * @return elemento encontrado
     */
    public Tipo_HabitacionEntity find(Long id) {
        Tipo_HabitacionEntity tipoH = em.find(Tipo_HabitacionEntity.class, id);
        return tipoH;
    }

    /**
     * Crear un objeto de la entidad Tipo_HabitacionEntity
     *
     * @param createTipo
     * @return objeto creado
     */
    public Tipo_HabitacionEntity create(Tipo_HabitacionEntity createTipo) {
        em.persist(createTipo);
        return createTipo;
    }

    /**
     * Actualizar un objeto de la entidad Tipo_HabitacionEntity
     *
     * @param ActualizarTipo
     * @return objeto actualizado
     */
    public Tipo_HabitacionEntity update(Tipo_HabitacionEntity ActualizarTipo) {
        return em.merge(ActualizarTipo);
    }

    /**
     * Eliminar un Objeto determinado de la entidad Tipo_HabitacionEntity
     *
     * @param id
     */
    public void delete(Long id) {
        Tipo_HabitacionEntity BorrarTipo = em.find(Tipo_HabitacionEntity.class, id);
        em.remove(BorrarTipo);
    }

}
