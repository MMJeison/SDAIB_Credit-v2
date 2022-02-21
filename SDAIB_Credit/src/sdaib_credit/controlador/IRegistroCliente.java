/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;
/**
 * @author User
 */
public interface IRegistroCliente {
    
    public void recibirNombre(String nombre);
    public void recibiridentificacion(String identificacion);
    public void registrar();
    public void cancelar();
    
}
