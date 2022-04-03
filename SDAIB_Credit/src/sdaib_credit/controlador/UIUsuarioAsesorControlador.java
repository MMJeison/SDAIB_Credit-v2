/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import sdaib_credit.vista.UIUsuarioAsesor;

/**
 *
 * @author User
 */
public class UIUsuarioAsesorControlador {
    
    private UIUsuarioAsesor uIUsuarioAsesor;
    private IRegistroCliente iRegistroCliente;
    private IRegistroCredito iRegistroCredito;
    private ILoginUsuario iLoginUsuario;
    private UIVerActInfClienteControlador uIVerActInfClienteControlador;

    public UIUsuarioAsesorControlador() {
        uIUsuarioAsesor = new UIUsuarioAsesor(this);
        
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uIUsuarioAsesor);
        Main.uIPrincipal.getPanel().updateUI();
    }
    
    public void registroCliente(){
        iRegistroCliente = new RegistroClienteControlador();
    }
    public void verActInfClientes(){
        uIVerActInfClienteControlador = new UIVerActInfClienteControlador();
    }
    public void registroCredito(){
        iRegistroCredito = new RegistroCreditoControlador();
    }
    public void cerrarSesion(){
        iLoginUsuario = new LoginUsuarioControlador();
    }
}
