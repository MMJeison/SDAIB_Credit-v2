/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.controlador;

import sdaib_credit.vista.UIPrincipal;

/**
 * @author User
 */
//dsdfsfdgfrg
public class Main {
    
    public static UIPrincipal uIPrincipal;
    public static ILoginUsuario iLoginUsuario;
    
    public Main(){
        uIPrincipal = new UIPrincipal();
        iLoginUsuario = new LoginUsuarioControlador();
    }
    
    public static void main(String[] args) {
        new Main();
    }
    
}
