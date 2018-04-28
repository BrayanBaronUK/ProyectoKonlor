/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.dto;

import co.edu.konrad.vl.entities.ReservaEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G40
 */
public class ReservaDTO {
    
     private Long idReserva;
    /**
     * almacena la fecha entrada
     */
    private String Fecha_Hora_Entrada;
    /**
     * almacena la fecha de salida
     */
    private String Fecha_Hora_Salida;
    /**
     * almacena el id del hotel
     */
    private Long idHotel;
    /**
     * almacena el id del cliente
     */
    private Long idCliente;
    /**
     * almacena el rol del usuario
     */
    private Long Cod_Rol;
    /**
     * almacena la forma de pago por codigo
     */ 
    private Long Cod_F_Pago;
    /**
     * almacena disponibilidad
     */
    private String Disponibilidad;
    private String programa;
    
       /**
     * Constructor por defecto
     */
    public ReservaDTO() {
    }

    
    public ReservaDTO(ReservaEntity Reserva){
        
        this.idReserva = Reserva.getIdReserva();
        this.Fecha_Hora_Entrada = Reserva.getFecha_Hora_Entrada();
        this.Fecha_Hora_Salida = Reserva.getFecha_Hora_Salida();
        this.idHotel = Reserva.getIdHotel();
        this.idCliente = Reserva.getIdCliente();
        this.Cod_Rol = Reserva.getCod_Rol();
        this.Cod_F_Pago = Reserva.getCod_F_Pago();
        this.Disponibilidad = Reserva.getDisponibilidad();
        this.programa = Reserva.getPrograma();
   
    }
       /**
     * Metodo para mapear a la entidad los datos capturados en la vista
     *
     * @return objeto de tipo ReservaEntity
     */
    
    public ReservaEntity toEntity(){
    
        ReservaEntity Reserva = new ReservaEntity();
        Reserva.setIdReserva(this.idReserva);
        Reserva.setFecha_Hora_Entrada(this.Fecha_Hora_Entrada);
        Reserva.setIdHotel(this.idHotel);
        Reserva.setIdCliente(this.idCliente);
        Reserva.setCod_Rol(this.Cod_Rol);
        Reserva.setCod_F_Pago(this.Cod_F_Pago);
        Reserva.setDisponibilidad(this.Disponibilidad);
        Reserva.setPrograma(this.programa);
        return Reserva;
    
    }
       /**
     * Conversion masiva de ReservaEntity a ReservaDTO
     *
     * @param ReservaList
     * @return
     */
        public static List<ReservaDTO> toReservaList(List<ReservaEntity> ReservaList){
    
        List<ReservaDTO> listaReserva = new ArrayList<>();
        for (int i = 0; i < ReservaList.size(); i++) {
            listaReserva.add(new ReservaDTO(ReservaList.get(i)));
        }
        return listaReserva;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
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

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
        
    
    
}
