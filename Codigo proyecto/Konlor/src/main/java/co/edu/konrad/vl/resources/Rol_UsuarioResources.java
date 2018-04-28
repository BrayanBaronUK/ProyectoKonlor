/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.resources;

import co.edu.konrad.vl.dto.Rol_UsuarioDTO;
import co.edu.konrad.vl.entities.Rol_UsuarioEntity;
import co.edu.konrad.vl.logic.Rol_UsuarioLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

     /**
 * Recurso/Servicio REST para manejo de Rol_Usuario
 * @author Cesar
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/rol_usuario")
public class Rol_UsuarioResources {
 
    @EJB
    private Rol_UsuarioLogic rol_usuarioLogic;
    
    
    @GET
    public List<Rol_UsuarioDTO> getRol_UsuarioList(){
        List<Rol_UsuarioEntity> cadena= rol_usuarioLogic.obtenerRol_Usuario();
        return Rol_UsuarioDTO.toRol_UsuarioList(cadena);
    }
 
    @GET
    @Path("{id: \\d+}")
    public Rol_UsuarioDTO getRol_Usuario(@PathParam("id") Long id){
        Rol_UsuarioEntity cadena = rol_usuarioLogic.obtenerRol_Usuario(id);
        if(cadena == null){
            throw new RuntimeException("El hotel no existe");
        }
        return new Rol_UsuarioDTO(cadena);
    }
    
    @POST
    public Rol_UsuarioDTO createRol_Usuario(Rol_UsuarioDTO rol_usuarioDTO){
        return new Rol_UsuarioDTO(rol_usuarioLogic.crearRol_Usuario(rol_usuarioDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public Rol_UsuarioDTO updateRol_Usuario(@PathParam("id") Long id, Rol_UsuarioDTO rol_usuarioDTO ){
        Rol_UsuarioEntity entity = rol_usuarioLogic.obtenerRol_Usuario(id);
        if(entity == null){
            throw new RuntimeException("el rol no existe");
        }
        return new Rol_UsuarioDTO(rol_usuarioLogic.actualizarRol_Usuario(id, rol_usuarioDTO.toEntity()));
    }
    
    
    @DELETE
    @Path("{rol_usuarioId: \\d+}")
    public void deleteRol_Usuario(@PathParam("rol_usuarioId") Long id){
        Rol_UsuarioEntity entity = rol_usuarioLogic.obtenerRol_Usuario(id);
        if(entity == null){
            throw new RuntimeException("El rol no existe");
        }
        rol_usuarioLogic.eliminarRol_Usuario(id);
    }
}


