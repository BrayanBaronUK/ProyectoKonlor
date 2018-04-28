/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.dto;

import co.edu.konrad.vl.entities.Rol_UsuarioEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G40
 */
public class Rol_UsuarioDTO {
    
    private Long Cod_rol;
    /**
     * almacena rol usuario
     */
    private String Rol_usuario;
    /**
     * almacena rol cliente
     */
    private String Rol_cliente;

    private String programa;
    
    public Rol_UsuarioDTO(){
    }
    public Rol_UsuarioDTO(Rol_UsuarioEntity Rol_Usuario){
    this.Cod_rol = Rol_Usuario.getCod_rol();
    this.Rol_usuario= Rol_Usuario.getRol_usuario();
    this.Rol_cliente = Rol_Usuario.getRol_cliente();
    this.programa = Rol_Usuario.getPrograma();
    }
    
        /**
     * Metodo para mapear a la entidad los datos capturados en la vista
     *
     * @return objeto de tipo Rol_UsuarioEntity
     */
    public Rol_UsuarioEntity toEntity(){
    
    Rol_UsuarioEntity Rol_Usuario = new Rol_UsuarioEntity();
    Rol_Usuario.setCod_rol(this.Cod_rol);
    Rol_Usuario.setRol_usuario(this.Rol_usuario);
    Rol_Usuario.setRol_cliente(this.Rol_cliente);
    Rol_Usuario.setPrograma(this.programa);
    return Rol_Usuario;
    }
      /**
     * Conversion masiva de Rol_UsuarioEntity a Rol_UsuarioDTO
     *
     * @param Rol_UsuarioList
     * @return
     */
    public static List<Rol_UsuarioDTO> toRol_UsuarioList(List<Rol_UsuarioEntity> Rol_UsuarioList){
    
        List<Rol_UsuarioDTO> listaRol_Usuario = new ArrayList<>();
        for (int i = 0; i < Rol_UsuarioList.size(); i++) {
            listaRol_Usuario.add(new Rol_UsuarioDTO(Rol_UsuarioList.get(i)));
        }
        return listaRol_Usuario;
    }

    public Long getCod_rol() {
        return Cod_rol;
    }

    public void setCod_rol(Long Cod_rol) {
        this.Cod_rol = Cod_rol;
    }

    public String getRol_usuario() {
        return Rol_usuario;
    }

    public void setRol_usuario(String Rol_usuario) {
        this.Rol_usuario = Rol_usuario;
    }

    public String getRol_cliente() {
        return Rol_cliente;
    }

    public void setRol_cliente(String Rol_cliente) {
        this.Rol_cliente = Rol_cliente;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    
    
}
