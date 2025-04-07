package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Medico;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\Maria liz\\Desktop\\farmaSalud\\src\\resources\\data\\empleados.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
    public List<Medico> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Medico>>(){}.getType();
            List<Medico> medicos = gson.fromJson(reader, tipoLista);
            return medicos != null ? medicos : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("Error al cargar médicos: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public void guardarMedico(Medico medico) {
        List<Medico> medicos = cargarTodos();
        medicos.add(medico);
        guardarTodos(medicos);
    }
    
    public void guardarTodos(List<Medico> medicos) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(medicos, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar médicos: " + e.getMessage());
        }
    }
}