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
public class GestorUsuarios implements IGestionUsuarios{
    
    private IGestorDataBase gestor;

    public GestorUsuarios() {
        gestor = new GestorJSON("src/sdaib_credit/persistencia/Usuarios.json",
                new TypeToken<List<Usuario>>(){}.getType());
    }

    @Override
    public Usuario getUsuario(String username) {
        return Usuario.getUsuario(username, gestor);
    }

    @Override
    public Usuario getUsuario(Usuario usuario) {
        return Usuario.getUsuario(usuario, gestor);
    }

    @Override
    public boolean registrarUsuario(Usuario usuario) {
        return Usuario.registrarUsuario(usuario, gestor);
    }
    
}
