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
public class DAOCliente implements IDAORegistros<Cliente>{

    private IGestorDataBase gestor;

    public DAOCliente() {
        gestor = new GestorJSON("src/sdaib_credit/persistencia/Clientes.json", 
                new TypeToken<List<Cliente>>(){}.getType());
    }
    
    @Override
    public Cliente getRegistro(String id) {
        Cliente cliente = null;
        List<Cliente> clientes = gestor.obtenerRegistros();
        for(Cliente clt : clientes){
            if(clt.getIdentificacion().equals(id)){
                cliente = clt;
                break;
            }
        }
        return cliente;
    }

    @Override
    public boolean actualizarRegistro(Cliente registro) {
        List<Cliente> clientes = gestor.obtenerRegistros();
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getIdentificacion().equals(registro.getIdentificacion())){
                clientes.set(i, registro);
                break;
            }
        }
        return gestor.actualizarRegistros(clientes);
    }

    @Override
    public boolean guardarRegistro(Cliente registro) {
        return gestor.guardarRegistro(registro);
    }
    
    @Override
    public List<Cliente> getListRegistros(){
        return gestor.obtenerRegistros();
    }
}
