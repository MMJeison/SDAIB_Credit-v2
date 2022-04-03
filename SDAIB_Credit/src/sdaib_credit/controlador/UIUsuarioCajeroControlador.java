/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import sdaib_credit.vista.UIUsuarioCajero;

/**
 *
 * @author User
 */
public class UIUsuarioCajeroControlador {
    private UIUsuarioCajero uIUsuarioCajero;
    private ILoginUsuario iLoginUsuario;
    private PagoControlador pagoControlador;
    
    public UIUsuarioCajeroControlador(){
        uIUsuarioCajero = new UIUsuarioCajero(this);
        
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uIUsuarioCajero);
        Main.uIPrincipal.getPanel().updateUI();
    }
    
    public void relizarPagos(){
        pagoControlador = new PagoControlador();
    }
    
    public void cerrarSesion(){
        iLoginUsuario = new LoginUsuarioControlador();
    }
}
