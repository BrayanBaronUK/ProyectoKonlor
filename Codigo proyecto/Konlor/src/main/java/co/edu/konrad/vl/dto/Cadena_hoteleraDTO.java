/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.dto;

import co.edu.konrad.vl.entities.Cadena_hoteleraEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G40
 */
public class Cadena_hoteleraDTO {
    private Long idCadena;

    /**
     * almacena el nombre del hotel
     */
    private String Nom_Cadena;

    /**
     * almacena la identificacion
     */
    private String Identificacion;

    private String programa;
    
    /*cadena por defecto*/
    
    public Cadena_hoteleraDTO(){
    
    }
    public Cadena_hoteleraDTO(Cadena_hoteleraEntity Cadena_hotelera){
    
    this.idCadena = Cadena_hotelera.getIdCadena();
    this.Nom_Cadena = Cadena_hotelera.getNom_Cadena();
    this.Identificacion = Cadena_hotelera.getIdentificacion();
    this.programa = Cadena_hotelera.getPrograma();
    
    }
     /**
     * Metodo para mapear a la entidad los datos capturados en la vista
     *
     * @return objeto de tipo EstudianteEntity
     */
    public Cadena_hoteleraEntity toEntity(){
    
        Cadena_hoteleraEntity Cadena_hotelera = new Cadena_hoteleraEntity();
        Cadena_hotelera.setIdCadena(this.idCadena);
        Cadena_hotelera.setNom_Cadena(this.Nom_Cadena);
        Cadena_hotelera.setIdentificacion(this.Identificacion);
        Cadena_hotelera.setPrograma(this.programa);
        return Cadena_hotelera;
    }
    
     /**
     * Conversion masiva de ClienteEntity a ClienteDTO
     *
     * @param Cadena_hoteleraList
     * @return
     */
    public List<Cadena_hoteleraDTO> toCadena_hoteleraList(List<Cadena_hoteleraEntity> Cadena_hoteleraList){
    
        List<Cadena_hoteleraDTO> listaCadena_hotelera = new ArrayList<>();
        for (int i = 0; i < Cadena_hoteleraList.size(); i++) {
            listaCadena_hotelera.add(new Cadena_hoteleraDTO(Cadena_hoteleraList.get(i)));
            
        }
        return listaCadena_hotelera;
    
    }

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
