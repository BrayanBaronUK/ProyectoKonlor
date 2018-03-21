/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Cesar chacon
 */
@Entity
public class HabitacionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * almacena el id de habitacion
     */
    @Id//indica que es llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)
    //sin atributo name queda con el mismo nombre de la clase
    @Column(name = "id_Habitacion", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idHabitacion;

    /**
     * almacena el numero de la habitacion
     */
    @Column(name = "num_habitacion")
    private String numHabitacion;

    /**
     * almacena el tipo de disponibilidad
     */
    @Column(name = "tipo_disponibilidad")
    private String tipoDisponibilidad;

    /**
     * almacena el id del hotel
     */
    @Column(name = "id_hotel", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idHotel;

    /**
     * almacena el id de tipo de habitacion
     */
    @Column(name = "id_tipo", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idTipo;

    /**
     * almacena el id de disponibilidad de la habitacion
     */
    @Column(name = "id_disponibilidad", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idDisponibilidad;

    @Column
    private String programa;

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
