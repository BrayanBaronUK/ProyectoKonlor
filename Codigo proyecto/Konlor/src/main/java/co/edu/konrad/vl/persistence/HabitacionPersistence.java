/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.persistence;

import co.edu.konrad.vl.entities.HabitacionEntity;
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
public class HabitacionPersistence {
    
         
    @PersistenceContext(unitName ="com.konrad.edu.co_Konlor_war_1.0-SNAPSHOTPU")
    protected EntityManager em; // que hacer la trasaccion
    
    /**
     * meotodo para obtener todos los elementos
     * @return 
     */
    public List<HabitacionEntity> findAll(){
        Query todos = em.createQuery("select ec from HabitacionEntity ec");
        return todos.getResultList();
    }
    /**
     * obtener un elemento a partir de su id
     * @param id
     * @return elemento encontrado
     */
    public HabitacionEntity find(Long id){
        HabitacionEntity estCurso = em.find(HabitacionEntity.class, id);
        return estCurso;
    }
    
    /**
     * Crear un objeto de la entidad HabitacionEntity
     * @param CrearHabitacion
     * @return objeto creado
     */
    public HabitacionEntity create(HabitacionEntity CrearHabitacion){
         em.persist(CrearHabitacion);
        return CrearHabitacion;
    }
    /**
     * Actualizar un objeto de la entidad HabitacionEntity
     * @param ActualizarHotel
     * @return objeto actualizado
     */
    public HabitacionEntity update(HabitacionEntity ActualizarHotel){
        return em.merge(ActualizarHotel);
    }
    
    /**
     * Eliminar un Objeto determinado de la entidad HabitacionEntity
     * @param id 
     */
    public void delete (Long id){
        HabitacionEntity estCursoBorrar = em.find(HabitacionEntity.class, id);
        em.remove(estCursoBorrar);
    }
    
}
