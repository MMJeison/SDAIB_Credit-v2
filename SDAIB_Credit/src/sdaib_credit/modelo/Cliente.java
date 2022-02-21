/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Cliente extends Persona{
    
    private List<String> creditos;

    public Cliente(String nombre, String identificacion) {
        super(nombre, identificacion);
        creditos = new ArrayList<>();
    }
    
    public void addCredito(String idCredito){
        creditos.add(idCredito);
    }
    
    public static Cliente getCliente(String identificaion, IGestorDataBase gestor) {
        Cliente aux = null;
        List<Cliente> clientes = gestor.obtenerRegistros();
        for(Cliente clt : clientes){
            if(clt.identificacion.equals(identificaion)){
                aux = clt;
                break;
            }
        }
        return aux;
    }
    
    public static boolean actualizarCliente(Cliente cliente, IGestorDataBase gestor) {
        List<Cliente> clientes = gestor.obtenerRegistros();
        for(Cliente clt : clientes){
            if(clt.identificacion.equals(cliente.identificacion)){
                clt.creditos = cliente.creditos;
                break;
            }
        }
        return gestor.actualizarRegistros(clientes);
    }
    
    public static boolean registrarCliente(Cliente cliente, IGestorDataBase gestor) {
        return gestor.guardarRegistro(cliente);
    }
}
