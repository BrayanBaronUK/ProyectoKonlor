/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.logic;

import co.edu.konrad.vl.entities.Cadena_hoteleraEntity;
import co.edu.konrad.vl.persistence.Cadena_hoteleraPersistence;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Cesar 
 */
public class Cadena_hoteleraLogic {
      /**
     * Inyección del persistence de cadena_hotelera
     */
    @Inject 
    private Cadena_hoteleraPersistence cadena_hoteleraPersistence;
    
    /**
     * Obtener todos las cadenas hoteleras
     * @return Lista cadenaH
     */
    public List<Cadena_hoteleraEntity> obtenerCadena_hotelera(){
        List<Cadena_hoteleraEntity> cadenaH = cadena_hoteleraPersistence.findAll();
        return cadenaH;
    }
    
    /**
     * Obtener una cadena hotelera a partir del id
     * @param id
     * @return cadenaH encontrado
     */
    public Cadena_hoteleraEntity obtenerCadena_hotelera(Long id){
        Cadena_hoteleraEntity cadenaH = cadena_hoteleraPersistence.find(id);
        if(cadenaH == null){
            throw new IllegalArgumentException("Cadena no encontrada.");
        }
        return cadenaH;
    }
    
    /**
     * Crear una nueva cadena hotelera
     * @param cadenaH
     * @return cadenaH
     */
    public Cadena_hoteleraEntity crearCadena_hotelera(Cadena_hoteleraEntity cadenaH){
        cadena_hoteleraPersistence.create(cadenaH);
        return cadenaH;
    }
    
    /**
     * Actualiza una cadenaH
     * @param cadenaEntity
     * @param id
     * @return cadenaH actualizado
     */
    public Cadena_hoteleraEntity actualizarCadena_hotelera(Long id, Cadena_hoteleraEntity cadenaEntity){
        Cadena_hoteleraEntity cadenaH = cadena_hoteleraPersistence.update(cadenaEntity);
        return cadenaH;
    }
    
    /**
     * Elimina un cadena hotelera
     * @param id 
     */
    public void eliminarCadena_hotelera(Long id){
        cadena_hoteleraPersistence.delete(id);
    }
}
