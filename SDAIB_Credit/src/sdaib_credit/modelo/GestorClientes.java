/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.modelo;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/**
 *
 * @author User
 */
public class GestorClientes implements IGestionClientes{

    private IGestorDataBase gestor;

    public GestorClientes() {
        gestor = new GestorJSON("src/sdaib_credit/persistencia/Clientes.json", 
                new TypeToken<List<Cliente>>(){}.getType());
    }

    @Override
    public Cliente getCliente(String identificaion) {
        return Cliente.getCliente(identificaion, gestor);
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) {
        return Cliente.actualizarCliente(cliente, gestor);
    }

    @Override
    public boolean registrarCliente(Cliente cliente) {
        return Cliente.registrarCliente(cliente, gestor);
    }
    
}
