/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import sdaib_credit.modelo.DAOUsuario;
import sdaib_credit.modelo.IDAORegistros;
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
    private IDAORegistros<Usuario> dAOUsuarios;
    
    private UIUsuarioAdministradorControlador uIUsuarioAdministradorControlador;
    private UIUsuarioAsesorControlador uIUsuarioAsesorControlador;
    private UIUsuarioCajeroControlador uIUsuarioCajeroControlador;
    
    public LoginUsuarioControlador(){
        uILoginUsuario = new UILoginUsuario(this);
        dAOUsuarios = new DAOUsuario();
        
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
        Usuario user = dAOUsuarios.getRegistro(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                if(!user.isHabilitado()){
                    JOptionPane.showMessageDialog(null, "Esta cuenta esta inhabilitada :(");
                    return;
                }
                if(user.getNivelAcceso().equals((byte)3)){
                    uIUsuarioAdministradorControlador = new UIUsuarioAdministradorControlador();
                }else if(user.getNivelAcceso().equals((byte)2)){
                    uIUsuarioAsesorControlador = new UIUsuarioAsesorControlador();
                }else{
                    uIUsuarioCajeroControlador = new UIUsuarioCajeroControlador();
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
