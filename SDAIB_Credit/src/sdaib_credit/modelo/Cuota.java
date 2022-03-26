/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.modelo;

/**
 *
 * @author User
 */
public class Cuota {
    
    private String monto;
    private String fechaDePago;
    private String idCredito;
    private boolean estaPaga;
    
    public Cuota(String monto, String fechaPago, String idCredito){
        this.monto = monto;
        this.fechaDePago = fechaPago;
        this.idCredito = idCredito;
        this.estaPaga = false;
    }
    
}
