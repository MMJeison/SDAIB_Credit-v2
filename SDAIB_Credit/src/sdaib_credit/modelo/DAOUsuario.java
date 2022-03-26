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
public class DAOUsuario implements IDAORegistros<Usuario>{
    
    private IGestorDataBase gestor;
    
    public DAOUsuario(){
        gestor = new GestorJSON("src/sdaib_credit/persistencia/Usuarios.json",
                new TypeToken<List<Usuario>>(){}.getType());
    }

    @Override
    public Usuario getRegistro(String id) {
        Usuario user = null;
        List<Usuario> usuarios = gestor.obtenerRegistros();
        for(Usuario u : usuarios){
            if(u.getUsername().equals(id)){
                user = u;
                break;
            }
        }
        return  user;
    }

    @Override
    public boolean actualizarRegistro(Usuario registro) {
        List<Usuario> usuarios = gestor.obtenerRegistros();
        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getUsername().equals(registro.getUsername())){
                usuarios.set(i, registro);
                break;
            }
        }
        return gestor.actualizarRegistros(usuarios);
    }

    @Override
    public boolean guardarRegistro(Usuario registro) {
        return gestor.guardarRegistro(registro);
    }
    
    @Override
    public List<Usuario> getListRegistros(){
        return gestor.obtenerRegistros();
    }
    
}
