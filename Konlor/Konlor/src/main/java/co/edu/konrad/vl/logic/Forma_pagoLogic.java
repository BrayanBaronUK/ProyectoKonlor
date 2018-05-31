/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.vl.logic;

import co.edu.konrad.vl.entities.Forma_pagoEntity;
import co.edu.konrad.vl.persistence.Forma_pagoPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Cesar
 */
@Stateless
public class Forma_pagoLogic {
        
    /**
     * Inyección del persistence de forma_pago
     */
    @Inject 
    private Forma_pagoPersistence forma_pagoPersistence;
    
    /**
     * Obtener todos las formas_pago
     * @return Lista forma_pago
     */
    public List<Forma_pagoEntity> obtenerForma_pago(){
        List<Forma_pagoEntity> forma_pago = forma_pagoPersistence.findAll();
        return forma_pago;
    }
    
    /**
     * Obtener una forma de pago a partir del id
     * @param id
     * @return forma_pago encontrado
     */
    public Forma_pagoEntity obtenerForma_pago(Long id){
        Forma_pagoEntity forma_pago = forma_pagoPersistence.find(id);
        if(forma_pago == null){
            throw new IllegalArgumentException("Forma de pago no fue encontrado.");
        }
        return forma_pago;
    }
    
    /**
     * Crear un nueva Forma de pago
     * @param formaEntity
     * @return formaEntity
     */
    public Forma_pagoEntity crearForma_pago(Forma_pagoEntity formaEntity){
        forma_pagoPersistence.create(formaEntity);
        return formaEntity;
    }
    
    /**
     * Actualiza un forma de pago
     * @param formaEntity
     * @param id
     * @return forma_pago actualizado
     */
    public Forma_pagoEntity actualizarForma_pago(Long id, Forma_pagoEntity formaEntity){
        Forma_pagoEntity forma_pago = forma_pagoPersistence.update(formaEntity);
        return forma_pago;
    }
    
    /**
     * Elimina un forma de pago
     * @param id 
     */
    public void eliminarForma_pago(Long id){
        forma_pagoPersistence.delete(id);
    }
}
