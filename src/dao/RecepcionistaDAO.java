/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import model.Cita;

/**
 *
 * @author Maria liz
 */
public class RecepcionistaDAO {
      private static final String ARCHIVO_JSON = "C:\\Users\\Maria liz\\Desktop\\farmaSalud\\src\\resources\\data\\citas.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public List<Cita> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Cita>>(){}.getType();
            List<Cita> citas = gson.fromJson(reader, tipoLista);
            return citas != null ? citas : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("Error al cargar citas: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public void guardarCita(Cita cita) {
        List<Cita> citas = cargarTodos();
        citas.add(cita);
        guardarTodos(citas);
    }
    
    public void guardarTodos(List<Cita> citas) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(citas, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar cita : " + e.getMessage());
        }
    }
}
