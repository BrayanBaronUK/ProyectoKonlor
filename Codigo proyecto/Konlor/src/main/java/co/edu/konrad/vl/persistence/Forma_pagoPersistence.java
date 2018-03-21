/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.persistence;

import co.edu.konrad.vl.entities.Forma_pagoEntity;
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
public class Forma_pagoPersistence {

    @PersistenceContext(unitName = "com.konrad.edu.co_Konlor_war_1.0-SNAPSHOTPU")
    protected EntityManager em; // que hacer la trasaccion

    /**
     * meotodo para obtener todos los elementos
     *
     * @return
     */
    public List<Forma_pagoEntity> findAll() {
        Query todos = em.createQuery("select ec from Forma_pagoEntity ec");
        return todos.getResultList();
    }

    /**
     * obtener un elemento a partir de su id
     *
     * @param id
     * @return elemento encontrado
     */
    public Forma_pagoEntity find(Long id) {
        Forma_pagoEntity formaFind = em.find(Forma_pagoEntity.class, id);
        return formaFind;
    }

    /**
     * Crear un objeto de la entidad Forma_pagoEntity
     *
     * @param CrearForma
     * @return objeto creado
     */
    public Forma_pagoEntity create(Forma_pagoEntity CrearForma) {
        em.persist(CrearForma);
        return CrearForma;
    }

    /**
     * Actualizar un objeto de la entidad Forma_pagoEntity
     *
     * @param ActualizarPago
     * @return objeto actualizado
     */
    public Forma_pagoEntity update(Forma_pagoEntity ActualizarPago) {
        return em.merge(ActualizarPago);
    }

    /**
     * Eliminar un Objeto determinado de la entidad Forma_pagoEntity
     *
     * @param id
     */
    public void delete(Long id) {
        Forma_pagoEntity BorrarPago = em.find(Forma_pagoEntity.class, id);
        em.remove(BorrarPago);
    }

}
