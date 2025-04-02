package model;

import java.util.Date;

public class Persona {
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String sexo;
    private String eps;
    private String email;
    private String celular;
    private byte[] fotoPerfil;
    private String direccion;

    // Constructor
    public Persona(String numeroDocumento, String nombres, String apellidos) {
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    
    
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }
}