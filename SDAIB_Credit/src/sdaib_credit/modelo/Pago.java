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
    private String idCredito;
    private String monto;
    private String fechaPago;

    public Pago(String id, String idCredito, String monto, String fechaPago) {
        this.id = id;
        this.idCredito = idCredito;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public String getId() {
        return id;
    }

    public String getIdCredito() {
        return idCredito;
    }

    public String getMonto() {
        return monto;
    }

    public String getFechaPago() {
        return fechaPago;
    }
    
    
}
