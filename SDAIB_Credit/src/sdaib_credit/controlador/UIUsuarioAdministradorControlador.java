/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import sdaib_credit.vista.UIUsuarioAdministrador;

/**
 *
 * @author User
 */
public class UIUsuarioAdministradorControlador {
    private HabInhabUsersControlador habInhabUsersControlador;
    private UIUsuarioAdministrador uIUsuarioAdministrador;
    private IRegistroUsuario iRegistroUsuario;
    private ILoginUsuario iLoginUsuario;

    public UIUsuarioAdministradorControlador() {
        
        uIUsuarioAdministrador= new UIUsuarioAdministrador(this);
        
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uIUsuarioAdministrador);
        Main.uIPrincipal.getPanel().updateUI();
    }
    
    public void registrarUsuario(){
        iRegistroUsuario = new RegistroUsuarioControlador();
    }
    public void habInhabCuentas(){
        habInhabUsersControlador = new HabInhabUsersControlador();
    }
    public void cerrarSesion(){
        iLoginUsuario = new LoginUsuarioControlador();
    }
    
}
