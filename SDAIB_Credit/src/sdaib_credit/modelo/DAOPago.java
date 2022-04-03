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
public class DAOPago implements IDAORegistros<Pago>{
    private IGestorDataBase gestor;
    
    public DAOPago(){
        gestor = new GestorJSON("src/sdaib_credit/persistencia/Pagos.json", 
                new TypeToken<List<Pago>>(){}.getType());
    }

    @Override
    public Pago getRegistro(String id) {
        Pago pago = null;
        List<Pago> pagos = gestor.obtenerRegistros();
        for(Pago p: pagos){
            if(p.getId().equals(id)){
                pago = p;
                break;
            }
        }
        return pago;
    }

    @Override
    public boolean actualizarRegistro(Pago registro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardarRegistro(Pago registro) {
        return gestor.guardarRegistro(registro);
    }

    @Override
    public List<Pago> getListRegistros() {
        return gestor.obtenerRegistros();
    }
    
}
