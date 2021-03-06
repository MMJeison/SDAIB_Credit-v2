/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.modelo;

import java.util.List;

/**
 *
 * @author User
 */
public class Usuario extends Persona{
    
    private String username;
    private String password;
    private boolean habilitado;
    private Byte nivelAcceso;

    public Usuario(String nombre, String identificacion, String username, String password, Byte nivelAcceso) {
        super(nombre, identificacion);
        this.username = username;
        this.password = password;
        this.nivelAcceso = nivelAcceso;
        habilitado = true;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Byte getNivelAcceso() {
        return nivelAcceso;
    }

    public boolean isHabilitado() {
        return habilitado;
    }
    
    public void habilitar(){
        habilitado = true;
    }
    
    public void inhabilitar(){
        habilitado = false;
    }
    
}
