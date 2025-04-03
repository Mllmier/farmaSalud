package model;

public class usuario {
    private String email;
    private String password;
    private Rol role;
    private Persona persona; 

    public usuario(String email, String password, Rol role, Persona persona) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.persona = persona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}