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
public class Tipo_HabitacionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * almacena codigo tipo
     */
    @Id//indica que es llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)
    //sin atributo name queda con el mismo nombre de la clase
    @Column(name = "id_tipo", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long IdTipo;

    /**
     * almacena precio
     */
    @Column(name = "precio")
    private String Precio;

    /**
     * almacena descripcion
     */
    @Column(name = "Descripcion")
    private String Descripcion;

    @Column
    private String programa;

    public Long getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(Long IdTipo) {
        this.IdTipo = IdTipo;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

}
