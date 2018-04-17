/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.dto;

import co.edu.konrad.vl.entities.HabitacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G40
 */
public class HabitacionDTO {

     private Long idHabitacion;
    /**
     * almacena el numero de la habitacion
     */
    private String numHabitacion;
    /**
     * almacena el tipo de disponibilidad
     */
    private String tipoDisponibilidad;
    /**
     * almacena el id del hotel
     */
    private Long idHotel;
    /**
     * almacena el id de tipo de habitacion
     */ 
    private Long idTipo;
    /**
     * almacena el id de disponibilidad de la habitacion
     */
    private Long idDisponibilidad;
    private String programa;
    
    public HabitacionDTO(){
    }
    
    public HabitacionDTO(HabitacionEntity Habitacion){
    
        this.idHabitacion = Habitacion.getIdHabitacion();
        this.numHabitacion = Habitacion.getNumHabitacion();
        this.tipoDisponibilidad = Habitacion.getTipoDisponibilidad();
        this.idHotel = Habitacion.getIdHotel();
        this.idTipo = Habitacion.getIdTipo();
        this.idDisponibilidad = Habitacion.getIdDisponibilidad();
        this.programa = Habitacion.getPrograma();
    }
    
     /**
     * Metodo para mapear a la entidad los datos capturados en la vista
     *
     * @return objeto de tipo HabitacionEntity
     */
    public HabitacionEntity toEntity(){
    
        HabitacionEntity Habitacion = new HabitacionEntity();
        Habitacion.setIdHabitacion(this.idHabitacion);
        Habitacion.setNumHabitacion(this.numHabitacion);
        Habitacion.setTipoDisponibilidad(this.tipoDisponibilidad);
        Habitacion.setIdHotel(this.idHotel);
        Habitacion.setIdTipo(this.idTipo);
        Habitacion.setIdDisponibilidad(this.idDisponibilidad);
        Habitacion.setPrograma(this.programa);
        return Habitacion;
    }
     /**
     * Conversion masiva de HabitacionEntity a HabitacionDTO
     *
     * @param HabitacionList
     * @return
     */
    public List<HabitacionDTO> toHabitacionList(List<HabitacionEntity> HabitacionList){
    
        List<HabitacionDTO> listaHabitacion = new ArrayList<>();
        for (int i = 0; i < HabitacionList.size(); i++) {
            listaHabitacion.add(new HabitacionDTO(HabitacionList.get(i)));
        }
        return listaHabitacion;
    }

    public Long getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Long idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipoDisponibilidad() {
        return tipoDisponibilidad;
    }

    public void setTipoDisponibilidad(String tipoDisponibilidad) {
        this.tipoDisponibilidad = tipoDisponibilidad;
    }

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public Long getIdDisponibilidad() {
        return idDisponibilidad;
    }

    public void setIdDisponibilidad(Long idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    
    
}
