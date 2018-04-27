/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.logic;

import co.edu.konrad.vl.entities.Tipo_HabitacionEntity;
import co.edu.konrad.vl.persistence.Tipo_HabitacionPersistence;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Cesar
 */
public class Tipo_HabitacionLogic {
        
    /**
     * Inyección del persistence de Tipo_Habitacion
     */
    @Inject 
    private Tipo_HabitacionPersistence tipoPersistence;
    
    /**
     * Obtener todos tipos de habitaciones
     * @return Lista tipo_habi
     */
    public List<Tipo_HabitacionEntity> obtenerTipo_Habitacion(){
        List<Tipo_HabitacionEntity> tipo_habi = tipoPersistence.findAll();
        return tipo_habi;
    }
    
    /**
     * Obtener un Tipo_Habitacion a partir del id
     * @param id
     * @return tipo_habi encontrado
     */
    public Tipo_HabitacionEntity obtenerTipo_Habitacion(Long id){
        Tipo_HabitacionEntity tipo_habi = tipoPersistence.find(id);
        if(tipo_habi == null){
            throw new IllegalArgumentException("El tipo de habitacion no fue encontrado");
        }
        return tipo_habi;
    }
    
    /**
     * Crear un nuevo Tipo_Habitacion
     * @param tipoEntity
     * @return tipoEntity
     */
    public Tipo_HabitacionEntity crearTipo_Habitacion(Tipo_HabitacionEntity tipoEntity){
        tipoPersistence.create(tipoEntity);
        return tipoEntity;
    }
    
    /**
     * Actualiza un Tipo_Habitacion
     * @param tipoEntity
     * @param id
     * @return tipo_habi actualizado
     */
    public Tipo_HabitacionEntity actualizarTipo_Habitacion(Long id, Tipo_HabitacionEntity tipoEntity){
        Tipo_HabitacionEntity tipo_habi = tipoPersistence.update(tipoEntity);
        return tipo_habi;
    }
    
    /**
     * Elimina un Tipo_Habitacion
     * @param id 
     */
    public void eliminarTipo_Habitacion(Long id){
        tipoPersistence.delete(id);
    }
}
