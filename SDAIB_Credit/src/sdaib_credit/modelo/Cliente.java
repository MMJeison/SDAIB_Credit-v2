/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Cliente extends Persona{
    
    private List<String> creditos;

    public Cliente(String nombre, String identificacion) {
        super(nombre, identificacion);
        creditos = new ArrayList<>();
    }
    
    public void addCredito(String idCredito){
        creditos.add(idCredito);
    }

    public List<String> getCreditos() {
        return creditos;
    }
}
