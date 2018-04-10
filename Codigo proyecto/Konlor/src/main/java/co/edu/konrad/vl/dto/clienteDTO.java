/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.dto;

import co.edu.konrad.vl.entities.ClienteEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G40
 */
public class clienteDTO {
    
    private Long idCliente;
    /**
     * almacena el nombre del cliente
     */
    private String nomCliente;
    /**
     * almacena cedula cliente
     */    
    private long CedulaCliente;
    /**
     * almacena edad del cliente
     */ 
    private Long edadCliente;
    /**
     * almacena id del registro
     */   
    private Long idRegistro;

    private String programa;
    
    /*cliente por defecto*/
    
    public clienteDTO(){

    }
    public clienteDTO(ClienteEntity cliente){
    
        this.idCliente = cliente.getIdCliente();
        this.nomCliente = cliente.getNomCliente();
        this.CedulaCliente = cliente.getCedulaCliente();
        this.edadCliente = cliente.getEdadCliente();
        this.idRegistro = cliente.getIdRegistro();
        this.programa = cliente.getPrograma();
        
    }
      /**
     * Metodo para mapear a la entidad los datos capturados en la vista
     *
     * @return objeto de tipo EstudianteEntity
     */
    public ClienteEntity toEntity(){
    
        ClienteEntity cliente = new ClienteEntity();
        cliente.setIdCliente(this.idCliente);
        cliente.setNomCliente(this.nomCliente);
        cliente.setCedulaCliente(this.CedulaCliente);
        cliente.setEdadCliente(this.edadCliente);
        cliente.setIdRegistro(this.idRegistro);
        cliente.setPrograma(this.programa);
        return cliente;

    }
      /**
     * Conversion masiva de ClienteEntity a ClienteDTO
     *
     * @param clienteList
     * @return
     */
    public List<clienteDTO> toClienteList(List<ClienteEntity> clienteList){
    
        List<clienteDTO> listaclientes = new ArrayList<>();
        for(int i=0; i< clienteList.size();i++){
            listaclientes.add(new clienteDTO(clienteList.get(i)));
        
        }
        return listaclientes;
    } 

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
