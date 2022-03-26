/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.modelo;

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
    
    public Credito(String id, String montoInicial, String montoActual, String idAcreedor) {
        this.id = id;
        this.montoInicial = montoInicial;
        this.montoActual = montoActual;
        this.idAcreedor = idAcreedor;
    }

    public Credito(String id, String monto, String idAcreedor) {
        this.id = id;
        this.montoInicial = monto;
        this.montoActual = monto;
        this.idAcreedor = idAcreedor;
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
