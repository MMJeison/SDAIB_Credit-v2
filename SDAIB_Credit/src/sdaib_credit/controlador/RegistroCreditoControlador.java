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
import sdaib_credit.modelo.DAOCredito;
import sdaib_credit.modelo.IDAORegistros;
import sdaib_credit.vista.UIRegistroCredito;

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
    private String intereses;
    private String tipoCredito;
    private IDAORegistros<Credito> dAOCreditos;
    private UIUsuarioAsesorControlador uIUsuarioControlador;
    private RegistroClienteControlador registroClienteControlador;
    
    public RegistroCreditoControlador() {
        registroClienteControlador = new RegistroClienteControlador();
        uIRegistroCredito = new UIRegistroCredito(this, registroClienteControlador);
        dAOCreditos = new DAOCredito();
        
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
    public void recibirInteres(String intereses) {
        this.intereses = intereses;
    }
    
    @Override
    public void recibirTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }
    
    @Override
    public void registar() {
        Credito crd = dAOCreditos.getRegistro(id);
        if(crd != null){
            JOptionPane.showMessageDialog(null, "Ya se ha registrado un credito con id: " + id);
            return;
        }
        boolean seRegistroCliente = false;
        if(idAcreedor == null || idAcreedor.equals("")){
            seRegistroCliente = registroClienteControlador.registrar();
            if(!seRegistroCliente) return;
            idAcreedor = registroClienteControlador.identificacion;
        }
        Cliente cliente = registroClienteControlador.dAOClientes.getRegistro(idAcreedor);
        if(cliente == null){
            JOptionPane.showMessageDialog(null, "La persona con identificacion '" + idAcreedor
                    + "' no se encuentra registrada");
            return;
        }
        Credito credito = new Credito(id, monto, idAcreedor, intereses, tipoCredito);
        cliente.addCredito(id);
        registroClienteControlador.dAOClientes.actualizarRegistro(cliente);
        boolean seRegistroCorrectamente = dAOCreditos.guardarRegistro(credito);
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
