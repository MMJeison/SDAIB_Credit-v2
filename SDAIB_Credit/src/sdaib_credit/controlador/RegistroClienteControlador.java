/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import sdaib_credit.modelo.Cliente;
import sdaib_credit.modelo.DAOCliente;
import sdaib_credit.modelo.IDAORegistros;
import sdaib_credit.vista.UIRegistroCliente;

/**
 * @author User
 */
public class RegistroClienteControlador implements IRegistroCliente{
    
    private UIRegistroCliente uIRegistroCliente;
    //private Cliente cliente;
    private String nombre;
    private String identificacion;
    private IDAORegistros<Cliente> dAOClientes;
    private UIUsuarioAsesorControlador uIUsuarioControlador;

    public RegistroClienteControlador() {
        
        uIRegistroCliente = new UIRegistroCliente(this);
        dAOClientes = new DAOCliente();
        
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uIRegistroCliente);
        Main.uIPrincipal.getPanel().updateUI();
    }

    @Override
    public void recibirNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibiridentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public void registrar() {
        Cliente cliente = dAOClientes.getRegistro(identificacion);
        if(cliente != null){
            JOptionPane.showMessageDialog(null, "La persona con identificacion '" + identificacion
                    + "' ya se encuentra registrada");
            return;
        }
        cliente = new Cliente(nombre, identificacion);
        boolean seRegistroCorrectamente = dAOClientes.guardarRegistro(cliente);
        if(seRegistroCorrectamente){
            JOptionPane.showMessageDialog(null, "El cliente se ha registrado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante el registro");
            return;
        }
        uIUsuarioControlador = new UIUsuarioAsesorControlador();
    }

    @Override
    public void cancelar() {
        uIUsuarioControlador = new UIUsuarioAsesorControlador();
    }
    
}
