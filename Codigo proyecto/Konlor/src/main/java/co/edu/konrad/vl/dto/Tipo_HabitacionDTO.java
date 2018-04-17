/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.dto;

import co.edu.konrad.vl.entities.Tipo_HabitacionEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G40
 */
public class Tipo_HabitacionDTO {
    
    private Long IdTipo;
    /**
     * almacena precio
     */
    private String Precio;
    /**
     * almacena descripcion
     */
    private String Descripcion;

    private String programa;
    
    public Tipo_HabitacionDTO(){
    
    }
    public Tipo_HabitacionDTO(Tipo_HabitacionEntity tipo_Habitacion){
        
        this.IdTipo = tipo_Habitacion.getIdTipo();
        this.Precio = tipo_Habitacion.getPrecio();
        this.Descripcion = tipo_Habitacion.getDescripcion();
        this.programa = tipo_Habitacion.getPrograma();
    }
    
        /**
     * Metodo para mapear a la entidad los datos capturados en la vista
     *
     * @return objeto de tipo Tipo_HabitacionEntity
     */
    
    public Tipo_HabitacionEntity toEntity(){
    
        Tipo_HabitacionEntity tipo_Habitacion = new Tipo_HabitacionEntity();
        tipo_Habitacion.setIdTipo(this.IdTipo);
        tipo_Habitacion.setPrecio(this.Precio);
        tipo_Habitacion.setDescripcion(this.Descripcion);
        tipo_Habitacion.setPrograma(this.programa);
        return tipo_Habitacion;
    
    }
       /**
     * Conversion masiva de Rol_UsuarioEntity a Rol_UsuarioDTO
     *
     * @param Tipo_HabitacionList
     * @return
     */
      public List<Tipo_HabitacionDTO> toTipo_HabitacionList(List<Tipo_HabitacionEntity> Tipo_HabitacionList){
    
        List<Tipo_HabitacionDTO> listaTipo_Habitacion = new ArrayList<>();
        for (int i = 0; i < Tipo_HabitacionList.size(); i++) {
            listaTipo_Habitacion.add(new Tipo_HabitacionDTO(Tipo_HabitacionList.get(i)));
        }
        return listaTipo_Habitacion;
    }

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
