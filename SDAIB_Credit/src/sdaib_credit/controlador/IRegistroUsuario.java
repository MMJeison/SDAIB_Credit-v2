/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

/**
 * @author User
 */
public interface IRegistroUsuario {
    
    public void recibeNombre(String nombre);
    public void recibeIdentificacion(String identificacion);
    public void recibeUsername(String username);
    public void recibePassword(String password);
    public void recibeNivelAcceso(Byte nivelAcceso);
    public void registrar();
    public void cancelar();
    
}
