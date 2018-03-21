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
public class HotelEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * almacena el id del hotel
     */
    @Id//indica que es llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)
    //sin atributo name queda con el mismo nombre de la clase
    @Column(name = "id_hotel", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idHotel;

    /**
     * almacena el nombre del hotel
     */
    @Column(name = "nom_hotel")
    private String nomHotel;

    /**
     * almacena la ubicacion
     */
    @Column(name = "ubicacion")
    private String Ubicacion;

    @Column
    private String programa;

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

}
