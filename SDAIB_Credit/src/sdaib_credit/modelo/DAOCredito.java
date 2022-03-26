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
public class DAOCredito implements IDAORegistros<Credito>{
    
    private IGestorDataBase gestor;

    public DAOCredito() {
        gestor = new GestorJSON("src/sdaib_credit/persistencia/Creditos.json", 
                new TypeToken<List<Credito>>(){}.getType());
    }

    @Override
    public Credito getRegistro(String id) {
        Credito credito = null;
        List<Credito> creditos = gestor.obtenerRegistros();
        for(Credito cred : creditos){
            if(cred.getId().equals(id)){
                credito = cred;
                break;
            }
        }
        return credito;
    }

    @Override
    public boolean actualizarRegistro(Credito registro) {
        List<Credito> creditos = gestor.obtenerRegistros();
        for(int i = 0; i < creditos.size(); i++){
            if(creditos.get(i).getId().equals(registro.getId())){
                creditos.set(i, registro);
                break;
            }
        }
        return gestor.actualizarRegistros(creditos);
    }

    @Override
    public boolean guardarRegistro(Credito registro) {
        return gestor.guardarRegistro(registro);
    }
    
    @Override
    public List<Credito> getListRegistros(){
        return gestor.obtenerRegistros();
    }
}
