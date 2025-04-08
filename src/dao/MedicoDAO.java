package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import model.Medico;
import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.stream.JsonWriter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class MedicoDAO {
    private static final String ARCHIVO_JSON = "C:\\Users\\Maria liz\\Desktop\\farmaSalud\\src\\resources\\data\\empleados.json";
    private Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
        .create();



    
    public List<Medico> cargarTodos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<ArrayList<Medico>>(){}.getType();
            List<Medico> medicos = gson.fromJson(reader, tipoLista);
            return medicos != null ? medicos : new ArrayList<>();
        } catch (IOException e) {
            System.err.println("tienes eso malo y no se puede cargar: " + e.getMessage());
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
    
    public boolean eliminarMedico(String numeroDocumento) {
        List<Medico> medicos = cargarTodos();
        boolean removed = medicos.removeIf(m -> m.getNumeroDocumento().equals(numeroDocumento));
        if (removed) {
            guardarTodos(medicos);
        }
        return removed;
    }

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
}