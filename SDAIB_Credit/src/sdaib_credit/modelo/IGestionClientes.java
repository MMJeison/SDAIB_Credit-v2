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
public interface IGestionClientes {
    
    public Cliente getCliente(String identificaion);
    public boolean actualizarCliente(Cliente cliente);
    public boolean registrarCliente(Cliente cliente);
    
}
