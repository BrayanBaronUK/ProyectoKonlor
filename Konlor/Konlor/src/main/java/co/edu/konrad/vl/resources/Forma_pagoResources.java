/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.resources;


import co.edu.konrad.vl.dto.Forma_pagoDTO;

import co.edu.konrad.vl.entities.Forma_pagoEntity;

import co.edu.konrad.vl.logic.Forma_pagoLogic;
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
 * Recurso/Servicio REST para manejo de Forma_pago
 * @author Cesar
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/forma_pago")
public class Forma_pagoResources {   
    @EJB
    private Forma_pagoLogic forma_pagoLogic;
    
   
    @GET
    public List<Forma_pagoDTO> getForma_pagoList(){
        List<Forma_pagoEntity> cadena = forma_pagoLogic.obtenerForma_pago();
        return Forma_pagoDTO.toForma_pagoList(cadena);
    }
  
    @GET
    @Path("{id: \\d+}")
    public Forma_pagoDTO getForma_pago(@PathParam("id") Long id){
        Forma_pagoEntity cadena = forma_pagoLogic.obtenerForma_pago(id);
        if(cadena == null){
            throw new RuntimeException("forma de pago no existe");
        }
        return new Forma_pagoDTO(cadena);
    }
    
    @POST
    public Forma_pagoDTO createForma_pago(Forma_pagoDTO forma_pagoDTO){
        return new Forma_pagoDTO(forma_pagoLogic.crearForma_pago(forma_pagoDTO.toEntity()));
    }
    
    @PUT
    @Path("{id: \\d+}")
    public Forma_pagoDTO updateForma_pago(@PathParam("id") Long id, Forma_pagoDTO forma_pagoDTO ){
        Forma_pagoEntity entity = forma_pagoLogic.obtenerForma_pago(id);
        if(entity == null){
            throw new RuntimeException("la forma de pago no fue encontrado");
        }
        return new Forma_pagoDTO(forma_pagoLogic.actualizarForma_pago(id, forma_pagoDTO.toEntity()));
    }
    
    
    @DELETE
    @Path("{forma_pagoId: \\d+}")
    public void deleteForma_pago(@PathParam("forma_pagoId") Long id){
        Forma_pagoEntity entity = forma_pagoLogic.obtenerForma_pago(id);
        if(entity == null){
            throw new RuntimeException("La forma de pago no fue encontrada");
        }
        forma_pagoLogic.eliminarForma_pago(id);
    }
}


