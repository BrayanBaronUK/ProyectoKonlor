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
public class Forma_pagoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * almacena codigo de la forma de pago
     */
    @Id//indica que es llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)
    //sin atributo name queda con el mismo nombre de la clase
    @Column(name = "cod_f_pago", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long Cod_F_Pago;

    /**
     * almacena pago tarjeta
     */
    @Column(name = "pago_tarjeta")
    private String Pago_Tarjeta;

    /**
     * almacena pago efectivo
     */
    @Column(name = "pago_efectivo")
    private String Pago_Efectivo;

    @Column
    private String programa;

    public Long getCod_F_Pago() {
        return Cod_F_Pago;
    }

    public void setCod_F_Pago(Long Cod_F_Pago) {
        this.Cod_F_Pago = Cod_F_Pago;
    }

    public String getPago_Tarjeta() {
        return Pago_Tarjeta;
    }

    public void setPago_Tarjeta(String Pago_Tarjeta) {
        this.Pago_Tarjeta = Pago_Tarjeta;
    }

    public String getPago_Efectivo() {
        return Pago_Efectivo;
    }

    public void setPago_Efectivo(String Pago_Efectivo) {
        this.Pago_Efectivo = Pago_Efectivo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

}
