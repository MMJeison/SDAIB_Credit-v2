/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import sdaib_credit.modelo.DAOUsuario;
import sdaib_credit.modelo.IDAORegistros;
import sdaib_credit.modelo.Usuario;
import sdaib_credit.vista.UIActDesacUsuarios;

/**
 *
 * @author User
 */
public class HabInhabUsersControlador {
    private UIActDesacUsuarios uIActDesacUsuarios;
    private IDAORegistros<Usuario> iDAOUsuarios;
    private UIUsuarioAdministradorControlador uIUsuarioAdministradorControlador;
    private String username;
    
    public HabInhabUsersControlador(){
        iDAOUsuarios = new DAOUsuario();
        uIActDesacUsuarios = new UIActDesacUsuarios(this);
        
        
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uIActDesacUsuarios);
        Main.uIPrincipal.getPanel().updateUI();
    }
    public void recibirUsername(String username){
        this.username = username;
    }
    public Usuario getUsuario(){
        return iDAOUsuarios.getRegistro(username);
    }
    public void habilitarUsuario(){
        Usuario usuario = getUsuario();
        usuario.habilitar();
        iDAOUsuarios.actualizarRegistro(usuario);
    }
    public void inhabilitarUsuario(){
        Usuario usuario = getUsuario();
        usuario.inhabilitar();
        iDAOUsuarios.actualizarRegistro(usuario);
    }
    public void cerrar(){
        uIUsuarioAdministradorControlador = new UIUsuarioAdministradorControlador();
    }
}
