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
public interface IDAORegistros<T> {
    public T getRegistro(String id);
    public boolean actualizarRegistro(T registro);
    public boolean guardarRegistro(T registro);
    public List<T> getListRegistros();
}
