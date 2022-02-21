/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

/**
 *
 * @author User
 */
public interface IRegistroCredito {
    
    public void recibirId(String id);
    public void recibirMonto(String monto);
    public void recibirIdAcreedor(String idAcreedor);
    public void registar();
    public void cancelar();
    
}
