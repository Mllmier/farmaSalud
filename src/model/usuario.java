package model;

public class Usuario {
    private String email;
    private String password;
    private Rol role;
    private boolean activo;
    private Persona persona; 

    public Usuario(String email, String password, Rol role, Persona persona) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.persona = persona;
        this.activo = true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}