/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import model.Salas;

/**
 *
 * @author usuario
 */
public class SalasDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\usuario\\Downloads\\farmaSalud\\src\\resources\\data\\salas.json";
    private Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
    .create();
    
    public class LocalDateAdapter extends TypeAdapter<LocalDate>{
        private final DateTimeFormatter formatter=DateTimeFormatter.ISO_LOCAL_DATE;
        @Override
        public void write(JsonWriter out,LocalDate value)throws IOException{
            if(value!=null){
                out.value(value.format(formatter));
            }else{
                out.nullValue();
            }
        }
        @Override 
    public LocalDate read(JsonReader in )throws IOException{
    String date = in.nextString();
    if (date == null || date.trim().isEmpty()) {
        return null; // <- evita parsear texto vacío
    }
    try {
        return LocalDate.parse(date, formatter);
    } catch (DateTimeParseException e) {
        System.err.println("Fecha inválida encontrada en JSON: " + date);
        return null;
    }
}
    }
    
    public List<Salas> cargarTodasSalas() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Salas>>(){}.getType();
            List<Salas> medicos = gson.fromJson(reader, tipoLista);
            return medicos != null ? medicos : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("tienes eso malo y no se puede cargar: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public void guardarSalas(Salas sala) {
        List<Salas> salas  = cargarTodasSalas();
        salas.add(sala);
        guardarTodos(salas);
    }
    
    public void guardarTodos(List<Salas> salas) {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(salas, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar salas: " + e.getMessage());
        }
    }

    
    
}
