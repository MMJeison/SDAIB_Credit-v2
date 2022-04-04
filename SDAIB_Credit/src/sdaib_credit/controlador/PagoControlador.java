/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import sdaib_credit.modelo.Credito;
import sdaib_credit.modelo.DAOCredito;
import sdaib_credit.modelo.DAOPago;
import sdaib_credit.modelo.IDAORegistros;
import sdaib_credit.modelo.Pago;
import sdaib_credit.vista.UIPago;

/**
 *
 * @author User
 */
public class PagoControlador {
    private UIUsuarioCajeroControlador uIUsuarioCajeroControlador;
    private IDAORegistros<Pago> dAOPagos;
    private IDAORegistros<Credito> dAOCreditos;
    private UIPago uIPago;
    private String idPago;
    private String montoAPagar;
    private String fecha;
    private String idCredito;
    private Credito credito;
    private Pago pago;
    
    public PagoControlador(){
        
        uIPago = new UIPago(this);
        dAOPagos = new DAOPago();
        dAOCreditos = new DAOCredito();
        
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uIPago);
        Main.uIPrincipal.getPanel().updateUI();
    }
    public void recibirIdPago(String idPago){
        this.idPago = idPago;
    }
    public void recibirMontoAPagar(String monto){
        montoAPagar = monto;
    }
    public void recibirFecha(String fecha){
        this.fecha = fecha;
    }
    public void recibirIdCredito(String idCredito){
        this.idCredito = idCredito;
    }
    public Credito getCredito(String id){
        return dAOCreditos.getRegistro(id);
    }
    public Pago getPago(String id){
        return dAOPagos.getRegistro(id);
    }
    public boolean realizarPago(){
        credito = dAOCreditos.getRegistro(idCredito);
        pago = new Pago(idPago, credito, montoAPagar, fecha);
        dAOCreditos.actualizarRegistro(credito);
        return dAOPagos.guardarRegistro(pago);
    }
    
    public void cerrar(){
        uIUsuarioCajeroControlador = new UIUsuarioCajeroControlador();
    }
    
}
