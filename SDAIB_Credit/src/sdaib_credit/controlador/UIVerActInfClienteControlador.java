/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import sdaib_credit.modelo.Cliente;
import sdaib_credit.modelo.Credito;
import sdaib_credit.modelo.DAOCliente;
import sdaib_credit.modelo.DAOCredito;
import sdaib_credit.modelo.IDAORegistros;
import sdaib_credit.vista.UIVerActInfClientes;

/**
 *
 * @author User
 */
public class UIVerActInfClienteControlador {
    private UIVerActInfClientes uIVerActInfClientes;
    public IDAORegistros<Cliente> iDAOClientes;
    public IDAORegistros<Credito> iDaoCreditos;
    private UIUsuarioAsesorControlador uIUsuarioAsesorControlador;
    
    public UIVerActInfClienteControlador(){
        iDAOClientes = new DAOCliente();
        iDaoCreditos = new DAOCredito();
        
        uIVerActInfClientes = new UIVerActInfClientes(this);
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uIVerActInfClientes);
        Main.uIPrincipal.getPanel().updateUI();
    }
    
    public void cerrar(){
        uIUsuarioAsesorControlador = new UIUsuarioAsesorControlador();
    }
}
