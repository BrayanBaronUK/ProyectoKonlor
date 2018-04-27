/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.logic;

import co.edu.konrad.vl.entities.HotelEntity;
import co.edu.konrad.vl.persistence.HotelPersistence;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Cesar
 */
public class HotelLogic {
        
    /**
     * Inyección del persistence de hotel
     */
    @Inject 
    private HotelPersistence hotelPersistence;
    
    /**
     * Obtener todos los hoteles
     * @return Lista hoteles
     */
    public List<HotelEntity> obtenerHotel(){
        List<HotelEntity> hoteles = hotelPersistence.findAll();
        return hoteles;
    }
    
    /**
     * Obtener un hotel a partir del id
     * @param id
     * @return hotel encontrado
     */
    public HotelEntity obtenerHotel(Long id){
        HotelEntity hotel = hotelPersistence.find(id);
        if(hotel == null){
            throw new IllegalArgumentException("El hotel no se ha encontrado");
        }
        return hotel;
    }
    
    /**
     * Crear un nuevo hotel
     * @param holEntity
     * @return holEntity
     */
    public HotelEntity crearHotel(HotelEntity holEntity){
        hotelPersistence.create(holEntity);
        return holEntity;
    }
    
    /**
     * Actualiza un hotel
     * @param holEntity
     * @param id
     * @return hotel actualizado
     */
    public HotelEntity actualizarHotel(Long id, HotelEntity holEntity){
        HotelEntity hotel = hotelPersistence.update(holEntity);
        return hotel;
    }
    
    /**
     * Elimina un hotel
     * @param id 
     */
    public void eliminarHotel(Long id){
        hotelPersistence.delete(id);
    }
}
