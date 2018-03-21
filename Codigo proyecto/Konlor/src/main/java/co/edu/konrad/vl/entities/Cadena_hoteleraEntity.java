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
public class Cadena_hoteleraEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * almacena el id de cadena
     */
    @Id//indica que es llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)
    //sin atributo name queda con el mismo nombre de la clase
    @Column(name = "id_cadena", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idCadena;

    /**
     * almacena el nombre del hotel
     */
    @Column(name = "nom_cadena")
    private String Nom_Cadena;

    /**
     * almacena la identificacion
     */
    @Column(name = "identificacion")
    private String Identificacion;

    @Column
    private String programa;

    public Long getIdCadena() {
        return idCadena;
    }

    public void setIdCadena(Long idCadena) {
        this.idCadena = idCadena;
    }

    public String getNom_Cadena() {
        return Nom_Cadena;
    }

    public void setNom_Cadena(String Nom_Cadena) {
        this.Nom_Cadena = Nom_Cadena;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

}
