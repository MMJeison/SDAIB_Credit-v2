/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdaib_credit.modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class GestorJSON implements IGestorDataBase{
    private Gson gson;
    private String json;
    private String filePath;
    private Type tipoRegistro;
    
    public GestorJSON(String filePath, Type tipoRegistro) {
        this.filePath = filePath;
        this.tipoRegistro = tipoRegistro;
    }
    
    @Override
    public boolean actualizarRegistros(List registros) {
        int size = registros.size();
        gson = new GsonBuilder().setPrettyPrinting().create();
        json = "[";
        for (int i = 0; i < size; i++) {
            json += "\n" + gson.toJson(registros.get(i));
            if (i < (size - 1)) {
                json += ",";
            }
        }
        json += "\n]";
        try (BufferedWriter bfWriter = new BufferedWriter(new FileWriter(filePath))) {
            bfWriter.write(json);
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return  false;
    }

    @Override
    public List obtenerRegistros() {
        List lista = new ArrayList<>();
        gson = new Gson();
        json = "";
        File archivo = new File(filePath);
        if (archivo.exists()) {
            try (BufferedReader bfReader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = bfReader.readLine()) != null) {
                    json += line;
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            lista = gson.fromJson(json, tipoRegistro);
        }
        return lista;
    }

    @Override
    public boolean guardarRegistro(Object registro) {
        List registros = obtenerRegistros();
        int size = registros.size();
        gson = new GsonBuilder().setPrettyPrinting().create();
        json = "[";
        for (int i = 0; i < size; i++) {
            json += "\n" + gson.toJson(registros.get(i)) + ",";
        }
        json += "\n" + gson.toJson(registro) + "\n]";
        try (BufferedWriter bfWriter = new BufferedWriter(new FileWriter(filePath))) {
            bfWriter.write(json);
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
}
