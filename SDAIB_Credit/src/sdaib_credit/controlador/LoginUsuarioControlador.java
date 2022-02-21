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
import sdaib_credit.vista.UILoginUsuario;

/**
 * @author User
 */
public class LoginUsuarioControlador implements ILoginUsuario {
    
    private UILoginUsuario uILoginUsuario;
    //private Usuario usuario;
    private String username;
    private String password;
    private IGestionUsuarios gestorUsuarios;
    
    private UIUsuarioAdministradorControlador uIUsuarioAdministradorControlador;
    private UIUsuarioAsesorControlador uIUsuarioAsesorControlador;
    
    public LoginUsuarioControlador(){
        uILoginUsuario = new UILoginUsuario(this);
        gestorUsuarios = new GestorUsuarios();
        
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uILoginUsuario);
        Main.uIPrincipal.getPanel().updateUI();
    }

    @Override
    public void recibirUsername(String username) {
        this.username = username;
    }

    @Override
    public void recibirPassword(String password) {
        this.password = password;
    }

    @Override
    public void ingresar() {
        Usuario user = gestorUsuarios.getUsuario(username);
        if (user != null) {
            if (user.passwordEqualsTo(password)) {
                if(user.nivelAccesoEqualsTo((byte)3)){
                    uIUsuarioAdministradorControlador = new UIUsuarioAdministradorControlador();
                }else if(user.nivelAccesoEqualsTo((byte)2)){
                    uIUsuarioAsesorControlador = new UIUsuarioAsesorControlador();
                }else{
                    JOptionPane.showMessageDialog(null, "Las acciones que puede realizar este usuario aun no han"
                            + " sido desarrolladas");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado");
        }
    }

//    @Override
//    public void salir() {
//        uIPrincipal.dispose();
//    }

}
