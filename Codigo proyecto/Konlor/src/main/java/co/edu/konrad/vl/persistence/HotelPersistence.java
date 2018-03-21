/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.persistence;

import co.edu.konrad.vl.entities.HotelEntity;
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
public class HotelPersistence {

    @PersistenceContext(unitName = "com.konrad.edu.co_Konlor_war_1.0-SNAPSHOTPU")
    protected EntityManager em; // que hacer la trasaccion

    /**
     * meotodo para obtener todos los elementos
     *
     * @return
     */
    public List<HotelEntity> findAll() {
        Query todos = em.createQuery("select ec from HotelEntity ec");
        return todos.getResultList();
    }

    /**
     * obtener un elemento a partir de su id
     *
     * @param id
     * @return elemento encontrado
     */
    public HotelEntity find(Long id) {
        HotelEntity estHotel = em.find(HotelEntity.class, id);
        return estHotel;
    }

    /**
     * Crear un objeto de la entidad HotelEntity
     *
     * @param HotelCrear
     * @return objeto creado
     */
    public HotelEntity create(HotelEntity HotelCrear) {
        em.persist(HotelCrear);
        return HotelCrear;
    }

    /**
     * Actualizar un objeto de la entidad HotelEntity
     *
     * @param ActualizarHotel
     * @return objeto actualizado
     */
    public HotelEntity update(HotelEntity ActualizarHotel) {
        return em.merge(ActualizarHotel);
    }

    /**
     * Eliminar un Objeto determinado de la entidad HotelEntity
     *
     * @param id
     */
    public void delete(Long id) {
        HotelEntity HotelBorrar = em.find(HotelEntity.class, id);
        em.remove(HotelBorrar);
    }

    public List<HotelEntity> findByName(String nombre) {

        TypedQuery<HotelEntity> hote = em.createNamedQuery("Cadena_hotelera.findByName", HotelEntity.class).setParameter("nombre", nombre);
        return hote.getResultList();
    }

}
