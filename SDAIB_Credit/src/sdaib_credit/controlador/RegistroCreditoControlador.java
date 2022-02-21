/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import sdaib_credit.modelo.Cliente;
import sdaib_credit.modelo.Credito;
import sdaib_credit.modelo.GestorClientes;
import sdaib_credit.modelo.GestorCreditos;
import sdaib_credit.modelo.IGestionClientes;
import sdaib_credit.vista.UIRegistroCredito;
import sdaib_credit.modelo.IGestionCreditos;

/**
 *
 * @author User
 */
public class RegistroCreditoControlador implements IRegistroCredito{

    private UIRegistroCredito uIRegistroCredito;
    //private Credito credito;
    private String id;
    private String monto;
    private String idAcreedor;
    private IGestionCreditos gestorCreditos;
    private IGestionClientes gestorClientes;
    private UIUsuarioAsesorControlador uIUsuarioControlador;
    
    public RegistroCreditoControlador() {
        uIRegistroCredito = new UIRegistroCredito(this);
        gestorCreditos = new GestorCreditos();
        gestorClientes = new GestorClientes();
        
        Main.uIPrincipal.getPanel().removeAll();
        Main.uIPrincipal.getPanel().setLayout(new FlowLayout());
        Main.uIPrincipal.getPanel().add(uIRegistroCredito);
        Main.uIPrincipal.getPanel().updateUI();
    }
    @Override
    public void recibirId(String id) {
        this.id = id;
    }

    @Override
    public void recibirMonto(String monto) {
        this.monto = monto;
    }

    @Override
    public void recibirIdAcreedor(String idAcreedor) {
        this.idAcreedor = idAcreedor;
    }

    @Override
    public void registar() {
        Cliente cliente = gestorClientes.getCliente(idAcreedor);
        if(cliente == null){
            JOptionPane.showMessageDialog(null, "La persona con identificacion '" + idAcreedor
                    + "' no se encuentra registrada");
            return;
        }
        //credito.setIdAcreedor(cliente.getIdentificacion());
        Credito credito = new Credito(id, monto, idAcreedor);
        cliente.addCredito(id);
        boolean seRegistroCorrectamente = gestorCreditos.registrarCredito(credito);
        gestorClientes.actualizarCliente(cliente);
        if(seRegistroCorrectamente){
            JOptionPane.showMessageDialog(null, "El credito se ha registrado correctamente");
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
