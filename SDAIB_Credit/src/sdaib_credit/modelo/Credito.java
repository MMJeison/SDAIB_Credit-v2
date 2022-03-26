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
public class Credito {
    private String id;
    private String montoInicial;
    private String montoActual;
    private String idAcreedor;
    private List<Cuota> cuotas;
    
    public Credito(String id, String montoInicial, String montoActual, String idAcreedor) {
        this.id = id;
        this.montoInicial = montoInicial;
        this.montoActual = montoActual;
        this.idAcreedor = idAcreedor;
        cuotas = new ArrayList<>();
    }

    public Credito(String id, String monto, String idAcreedor) {
        this.id = id;
        this.montoInicial = monto;
        this.montoActual = monto;
        this.idAcreedor = idAcreedor;
        cuotas = new ArrayList<>();
    }
    
    public void definirCuotas(int nCuotas){
        float cuota = Integer.valueOf(montoInicial)/nCuotas;
        Cuota aux;
        for(int i = 0; i < nCuotas; i++){
            aux = new Cuota(String.valueOf(cuota), null, id);
            cuotas.add(aux);
        }
    }

    public String getId() {
        return id;
    }

    public String getMontoInicial() {
        return montoInicial;
    }

    public String getMontoActual() {
        return montoActual;
    }

    public String getIdAcreedor() {
        return idAcreedor;
    }
}
