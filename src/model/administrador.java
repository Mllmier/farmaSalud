package model;



public class Administrador extends Persona {
    private String codigoEmpleado;

    public Administrador(String numeroDocumento, String nombres, String apellidos, String codigoEmpleado) {
        super(numeroDocumento, nombres, apellidos);
        this.codigoEmpleado = codigoEmpleado;
    }
        
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }


}