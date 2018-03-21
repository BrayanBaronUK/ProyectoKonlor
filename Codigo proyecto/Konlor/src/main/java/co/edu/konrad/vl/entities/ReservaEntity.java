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
public class ReservaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * almacena el id de reserva
     */
    @Id//indica que es llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)
    //sin atributo name queda con el mismo nombre de la clase
    @Column(name = "id_reserva", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idReserva;

    /**
     * almacena la fecha entrada
     */
    @Column(name = "fecha_hora_entrada")
    private String Fecha_Hora_Entrada;

    /**
     * almacena la fecha de salida
     */
    @Column(name = "fecha_hora_salida")
    private String Fecha_Hora_Salida;

    /**
     * almacena el id del hotel
     */
    @Column(name = "id_hotel", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idHotel;

    /**
     * almacena el id del cliente
     */
    @Column(name = "id_Cliente", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long idCliente;

    /**
     * almacena el rol del usuario
     */
    @Column(name = "cod_rol", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long Cod_Rol;

    /**
     * almacena la forma de pago por codigo
     */
    @Column(name = "cod_f_pago", unique = true, nullable = false)//se define que el atributo esta unico y no puede ser nulo 
    private Long Cod_F_Pago;

    /**
     * almacena disponibilidad
     */
    @Column(name = "disponibilidad")
    private String Disponibilidad;

    @Column
    private String programa;

    public Long getIdRegistro() {
        return idReserva;
    }

    public void setIdRegistro(Long idRegistro) {
        this.idReserva = idRegistro;
    }

    public String getFecha_Hora_Entrada() {
        return Fecha_Hora_Entrada;
    }

    public void setFecha_Hora_Entrada(String Fecha_Hora_Entrada) {
        this.Fecha_Hora_Entrada = Fecha_Hora_Entrada;
    }

    public String getFecha_Hora_Salida() {
        return Fecha_Hora_Salida;
    }

    public void setFecha_Hora_Salida(String Fecha_Hora_Salida) {
        this.Fecha_Hora_Salida = Fecha_Hora_Salida;
    }

    public Long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Long idHotel) {
        this.idHotel = idHotel;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getCod_Rol() {
        return Cod_Rol;
    }

    public void setCod_Rol(Long Cod_Rol) {
        this.Cod_Rol = Cod_Rol;
    }

    public Long getCod_F_Pago() {
        return Cod_F_Pago;
    }

    public void setCod_F_Pago(Long Cod_F_Pago) {
        this.Cod_F_Pago = Cod_F_Pago;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;

    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

}
