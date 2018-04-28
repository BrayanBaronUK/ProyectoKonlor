/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.dto;

import co.edu.konrad.vl.entities.Forma_pagoEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G40
 */
public class Forma_pagoDTO {
     private Long Cod_F_Pago;

    /**
     * almacena pago tarjeta
     */
    private String Pago_Tarjeta;

    /**
     * almacena pago efectivo
     */
    private String Pago_Efectivo;


    private String programa;
    
    public Forma_pagoDTO(){
    
    }
    public Forma_pagoDTO(Forma_pagoEntity forma_pago){
    
        this.Cod_F_Pago = forma_pago.getCod_F_Pago();
        this.Pago_Tarjeta = forma_pago.getPago_Tarjeta();
        this.Pago_Efectivo = forma_pago.getPago_Efectivo();
        this.programa = forma_pago.getPrograma();
    }
     /**
     * Metodo para mapear a la entidad los datos capturados en la vista
     *
     * @return objeto de tipo forma_pagoEntity
     */
    public Forma_pagoEntity toEntity(){
    
        Forma_pagoEntity forma_pago = new Forma_pagoEntity();
        forma_pago.setCod_F_Pago(this.Cod_F_Pago);
        forma_pago.setPago_Tarjeta(this.Pago_Tarjeta);
        forma_pago.setPago_Efectivo(this.Pago_Efectivo);
        forma_pago.setPrograma(this.programa);
        return forma_pago;
    }
      /**
     * Conversion masiva de forma_pagoEntity a forma_pagoDTO
     *
     * @param forma_pagoList
     * @return
     */
    public static List<Forma_pagoDTO> toForma_pagoList(List<Forma_pagoEntity> Forma_pagoList){
    
        List<Forma_pagoDTO> listaForma_pago = new ArrayList<>();
         for (int i = 0; i < Forma_pagoList.size(); i++) {
            listaForma_pago.add(new Forma_pagoDTO(Forma_pagoList.get(i)));
                
            }
        return listaForma_pago;
    
    }

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
