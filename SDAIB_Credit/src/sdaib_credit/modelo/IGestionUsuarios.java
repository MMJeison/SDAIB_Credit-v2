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
public interface IGestionUsuarios {
    
    public Usuario getUsuario(String username);
    public Usuario getUsuario(Usuario usuario);
    public boolean registrarUsuario(Usuario usuario);
    
}
