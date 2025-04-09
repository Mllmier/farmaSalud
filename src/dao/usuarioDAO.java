package dao;

import model.Rol;
import model.Usuario;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import model.Recepcionista;

import model.Rol;
import model.Usuario;

/**
 *
 * @author Maria liz
 */public class UsuarioDAO {
    
    //admin creado con email y password
  
 
    private static final String JSON_FILE = "C:\\Users\\HP\\Desktop\\farmaSalud\\src\\resources\\data\\usuarios.json";

    public Usuario validarCredenciales(String email, String password) {
        try (FileReader reader = new FileReader(JSON_FILE)) {
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            JsonArray usuariosJson = jsonObject.getAsJsonArray("usuarios");

            for (int i = 0; i < usuariosJson.size(); i++) {
                JsonObject usuarioJson = usuariosJson.get(i).getAsJsonObject();

                String userEmail = usuarioJson.get("email").getAsString();
                String userPassword = usuarioJson.get("password").getAsString();

                if (userEmail.equals(email) && userPassword.equals(password)) {
                    Rol rol = Rol.valueOf(usuarioJson.get("rol").getAsString());
                    return new Usuario(userEmail, userPassword, rol, null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean esAdministrador(Usuario usuario) {
        return usuario != null && usuario.getRole() == Rol.ADMINISTRADOR;
    }
    public boolean esRecepcionista(Usuario recepcionista){
        return recepcionista !=null && recepcionista.getRole()==Rol.RECEPCIONISTA;
    }
    public boolean esDoctor(Usuario doctor){
        return doctor !=null && doctor.getRole()==Rol.MEDICO;
    }
}

 
