/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.logic;

import co.edu.konrad.vl.entities.HabitacionEntity;
import co.edu.konrad.vl.persistence.HabitacionPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Cesar
 */
@Stateless
public class HabitacionLogic {
        
    /**
     * Inyección del persistence de habitacion
     */
    @Inject 
    private HabitacionPersistence habitacionPersistence;
    
    /**
     * Obtener todas las habitaciones
     * @return Lista habitaciones
     */
    public List<HabitacionEntity> obtenerHabitacion(){
        List<HabitacionEntity> habitaciones = habitacionPersistence.findAll();
        return habitaciones;
    }
    
    /**
     * Obtener una Habitacion a partir del id
     * @param id
     * @return Habitacion encontrado
     */
    public HabitacionEntity obtenerHabitacion(Long id){
        HabitacionEntity habitacion = habitacionPersistence.find(id);
        if(habitacion == null){
            throw new IllegalArgumentException("La habitacion no se ha encontrado.");
        }
        return habitacion;
    }
    
    /**
     * Crear un nueva Habitacion
     * @param habiEntity
     * @return habiEntity
     */
    public HabitacionEntity crearHabitacion(HabitacionEntity habiEntity){
        habitacionPersistence.create(habiEntity);
        return habiEntity;
    }
    
    /**
     * Actualiza una habitacion
     * @param habiEntity
     * @param id
     * @return Habitacion actualizado
     */
    public HabitacionEntity actualizarHabitacion(Long id, HabitacionEntity habiEntity){
        HabitacionEntity habitacion = habitacionPersistence.update(habiEntity);
        return habitacion;
    }
    
    /**
     * Elimina una habitacion
     * @param id 
     */
    public void eliminarHabitacion(Long id){
        habitacionPersistence.delete(id);
    }
}
