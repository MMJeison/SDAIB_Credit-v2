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
public class Pago {
    
    private String id;
    private Credito credito;
    private String monto;
    private String fechaPago;

    public Pago(String id, Credito credito, String monto, String fechaPago) {
        this.id = id;
        this.credito = credito;
        this.monto = monto;
        this.fechaPago = fechaPago;
        procesarPago();
    }
    
    public void procesarPago(){
        credito.procesarPago(this);
    }
    
    public String getId() {
        return id;
    }

    public Credito getCredito() {
        return credito;
    }

    public String getMonto() {
        return monto;
    }

    public String getFechaPago() {
        return fechaPago;
    }
    
    
}
