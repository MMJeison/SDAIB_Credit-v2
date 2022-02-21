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
public class GestorCreditos implements IGestionCreditos{
    
    private IGestorDataBase gestor;

    public GestorCreditos() {
        gestor = new GestorJSON("src/sdaib_credit/persistencia/Creditos.json", 
                new TypeToken<List<Credito>>(){}.getType());
    }

    @Override
    public Credito getCredito(String id) {
        return Credito.getCredito(id, gestor);
    }

    @Override
    public boolean registrarCredito(Credito credito) {
        return Credito.registrarCredito(credito, gestor);
    }
}
