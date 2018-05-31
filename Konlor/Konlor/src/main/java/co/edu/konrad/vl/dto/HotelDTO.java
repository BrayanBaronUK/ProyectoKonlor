/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.dto;


import co.edu.konrad.vl.entities.HotelEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G40
 */
public class HotelDTO {
    
    private Long idHotel;
    /**
     * almacena el nombre del hotel
     */
    private String nomHotel;

    /**
     * almacena la ubicacion
     */
    private String Ubicacion;
    private String programa;
    
    public HotelDTO(){
    
    }
    public HotelDTO(HotelEntity Hotel){
    
        this.idHotel = Hotel.getIdHotel();
        this.nomHotel = Hotel.getNomHotel();
        this.Ubicacion = Hotel.getUbicacion();
        this.programa = Hotel.getPrograma();
    }
     /**
     * Metodo para mapear a la entidad los datos capturados en la vista
     *
     * @return objeto de tipo HotelEntity
     */
    public HotelEntity toEntity(){
    
        HotelEntity Hotel = new HotelEntity();
        Hotel.setIdHotel(this.idHotel);
        Hotel.setNomHotel(this.nomHotel);
        Hotel.setUbicacion(this.Ubicacion);
        Hotel.setPrograma(this.programa);
        return Hotel; 
    }
      /**
     * Conversion masiva de HotelEntity a HotelDTO
     *
     * @param HotelList
     * @return
     */
      public static List<HotelDTO> toHotelList(List<HotelEntity> HotelList){
    
        List<HotelDTO> listaHotel = new ArrayList<>();
        for (int i = 0; i < HotelList.size(); i++) {
            listaHotel.add(new HotelDTO(HotelList.get(i)));
        }
        return listaHotel;
    }

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
