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
public interface ILoginUsuario {
     
    public void recibirUsername(String username);
    public void recibirPassword(String password);
    public void ingresar();
    //public void salir();
}
