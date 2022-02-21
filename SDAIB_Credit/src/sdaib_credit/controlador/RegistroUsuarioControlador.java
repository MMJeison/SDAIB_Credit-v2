/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import sdaib_credit.modelo.GestorUsuarios;
import sdaib_credit.modelo.IGestionUsuarios;
import sdaib_credit.modelo.Usuario;
import sdaib_credit.vista.UIRegistroUsuario;

/**
 *
 * @author User
 */
public class RegistroUsuarioControlador implements IRegistroUsuario{

    private UIRegistroUsuario uIRegistroUsuario;
    //private Usuario usuario;
    private String nombre;
    private String identificacion;
    private String username;
    private String password;
    private Byte nivelAcceso;
    private IGestionUsuarios gestorUsuarios;
    private UIUsuarioAdministradorControlador uIUsuarioAdministradorControlador;
    
    public RegistroUsuarioControlador(){
        uIRegistroUsuario = new UIRegistroUsuario(this);
        gestorUsuarios = new GestorUsuarios();
        
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uIRegistroUsuario);
        Main.uIPrincipal.getPanel().updateUI();
    }
    
    @Override
    public void recibeNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibeIdentificacion(String identificacion) {
       this.identificacion = identificacion;
    }

    @Override
    public void recibeUsername(String username) {
        this.username = username;
    }

    @Override
    public void recibePassword(String password) {
        this.password = password;
    }

    @Override
    public void recibeNivelAcceso(Byte nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public void registrar() {
        Usuario usuario = new Usuario(nombre, identificacion, username, password, nivelAcceso);
        Usuario user = gestorUsuarios.getUsuario(usuario);
        if(user != null){
            JOptionPane.showMessageDialog(null, "La parsona con identificacion '" + identificacion
                    + "' ya tiene un usuario registrado");
            return;
        }
        user = gestorUsuarios.getUsuario(username);
        if(user != null){
            JOptionPane.showMessageDialog(null, "El username '" + username + "' ya se encuentra registrado");
            return;
        }
        
        boolean seRegistroCorrectamente = gestorUsuarios.registrarUsuario(usuario);
        if(seRegistroCorrectamente){
            JOptionPane.showMessageDialog(null, "El usuario se ha registrado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante el registro");
            return;
        }
        uIUsuarioAdministradorControlador = new UIUsuarioAdministradorControlador();
    }

    @Override
    public void cancelar() {
        uIUsuarioAdministradorControlador = new UIUsuarioAdministradorControlador();
    }
    
}