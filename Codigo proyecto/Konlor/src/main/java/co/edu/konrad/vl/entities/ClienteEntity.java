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
public class ClienteEntity implements Serializable {

    //atributo para manejo de version
    private static final long serialVersionUID = 1L;
    /**
     * almacena el id del cliente
     */
    @Id//indica que es llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)

    //sin atributo name queda con el mismo nombre de la clase
    @Column(name = "id_cliente", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idCliente;

    /**
     * almacena el nombre del cliente
     */
    @Column(name = "nom_cliente")
    private String nomCliente;

    /**
     * almacena cedula cliente
     */
    @Column(name = "cedula_cliente", unique = true)
    private long CedulaCliente;

    /**
     * almacena edad del cliente
     */
    @Column(name = "edad_cliente")
    private Long edadCliente;

    /**
     * almacena id del registro
     */
    @Column(name = "id_registro", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idRegistro;

    @Column
    private String programa;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public long getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(long CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public Long getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(Long edadCliente) {
        this.edadCliente = edadCliente;
    }

    public Long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

}
