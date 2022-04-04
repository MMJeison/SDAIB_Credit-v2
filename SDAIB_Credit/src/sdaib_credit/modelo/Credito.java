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
    private String tipoCredito;
    private String interes;
    private boolean pagado;
    private List<String> pagos;

    public Credito(String id, String monto, String idAcreedor, String interes, String tipoCredito) {
        this.id = id;
        this.montoInicial = monto;
        this.idAcreedor = idAcreedor;
        this.interes = interes;
        pagos = new ArrayList<>();
        calcularValorAPagar();
        this.tipoCredito = tipoCredito;
        pagado = false;
    }
    
    private void calcularValorAPagar(){
        int v = Integer.valueOf(montoInicial);
        float i = Float.valueOf(interes) / 100;
        float vp = v*(1 + i);
        montoActual = String.valueOf(vp);
    }
    public Float procesarPago(Pago pago){
        Float montoAPagar = Float.valueOf(pago.getMonto());
        Float montoAct = Float.valueOf(montoActual);
        Float restante = montoAct - montoAPagar;
        montoActual = String.valueOf(restante);
        pagos.add(pago.getId());
        if(restante == 0){
            pagado = true;
        }
        return restante;
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

    public String getTipoCredito() {
        return tipoCredito;
    }
    
    public String getInteres() {
        return interes;
    }

    public boolean isPagado() {
        return pagado;
    }

    public List<String> getPagos() {
        return pagos;
    }
    
}
