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

/**
 * @author User
 */
public class RegistroClienteControlador implements IRegistroCliente{
    //private Cliente cliente;
    public String nombre;
    public String identificacion;
    public IDAORegistros<Cliente> dAOClientes;

    public RegistroClienteControlador() {
        dAOClientes = new DAOCliente();
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
    public boolean registrar() {
        Cliente cliente = dAOClientes.getRegistro(identificacion);
        if(cliente != null){
            JOptionPane.showMessageDialog(null, "La persona con identificacion '" + identificacion
                    + "' ye es un cliente registrado");
            return false;
        }
        cliente = new Cliente(nombre, identificacion);
        boolean seRegistroCorrectamente = dAOClientes.guardarRegistro(cliente);
        if(seRegistroCorrectamente){
            JOptionPane.showMessageDialog(null, "El cliente se ha registrado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante el registro");
            return false;
        }
        return true;
    }
}
