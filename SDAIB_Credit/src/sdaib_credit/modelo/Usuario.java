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
    private Byte nivelAcceso;

    public Usuario(String nombre, String identificacion, String username, String password, Byte nivelAcceso) {
        super(nombre, identificacion);
        this.username = username;
        this.password = password;
        this.nivelAcceso = nivelAcceso;
    }
    
    public boolean userEqualsTo(String username){
        return this.username.equals(username);
    }
    
    public static Usuario getUsuario(String username, IGestorDataBase gestor) {
        Usuario aux = null;
        List<Usuario> usuarios = gestor.obtenerRegistros();
        for(Usuario user : usuarios){
            if(user.userEqualsTo(username)){
                aux = user;
                break;
            }
        }
        return  aux;
    }
    
    public static Usuario getUsuario(Usuario usuario, IGestorDataBase gestor) {
        Usuario aux = null;
        List<Usuario> usuarios = gestor.obtenerRegistros();
        for(Usuario user : usuarios){
            if(user.identificacion.equals(usuario.identificacion)){
                aux = user;
                break;
            }
        }
        return  aux;
    }
    
    public static boolean registrarUsuario(Usuario usuario, IGestorDataBase gestor) {
        return gestor.guardarRegistro(usuario);
    }
    
    public boolean passwordEqualsTo(String password){
        return this.password.equals(password);
    }
    
    public boolean nivelAccesoEqualsTo(Byte nivelAcceso){
        return this.nivelAcceso.equals(nivelAcceso);
    }
    
}
