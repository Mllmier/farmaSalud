package model;

import java.time.LocalDate;

public class Recepcionista extends Persona {
    private String codigoEmpleado;
    private LocalDate fechaContratacion;
    private Paciente paciente;
    private Medico medico;
    private String turno;

    public Recepcionista(String numeroDocumento, String nombres, String apellidos, String codigoEmpleado) {
        super(numeroDocumento, nombres, apellidos);
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

   
}