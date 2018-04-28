/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.logic;

import co.edu.konrad.vl.entities.ReservaEntity;
import co.edu.konrad.vl.persistence.ReservaPersistence;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Cesar
 */
public class ReservaLogic {
        
    /**
     * Inyección del persistence de reserva
     */
    @Inject 
    private ReservaPersistence reservaPersistence;
    
    /**
     * Obtener todos las reservas
     * @return Lista reservas
     */
    public List<ReservaEntity> obtenerReserva(){
        List<ReservaEntity> reservas = reservaPersistence.findAll();
        return reservas;
    }
    
    /**
     * Obtener una reserva a partir del id
     * @param id
     * @return reserva encontrado
     */
    public ReservaEntity obtenerReserva(Long id){
        ReservaEntity reserva = reservaPersistence.find(id);
        if(reserva == null){
            throw new IllegalArgumentException("La resera no fue encontrada");
        }
        return reserva;
    }
    
    /**
     * Crear una nueva reserva
     * @param reserEntity
     * @return reserEntity
     */
    public ReservaEntity crearReserva(ReservaEntity reserEntity){
        reservaPersistence.create(reserEntity);
        return reserEntity;
    }
    
    /**
     * Actualiza una reserva
     * @param reserEntity
     * @param id
     * @return reserva actualizado
     */
    public ReservaEntity actualizarReserva(Long id, ReservaEntity reserEntity){
        ReservaEntity reserva = reservaPersistence.update(reserEntity);
        return reserva;
    }
    
    /**
     * Elimina una reserva
     * @param id 
     */
    public void eliminarReserva(Long id){
        reservaPersistence.delete(id);
    }
}
