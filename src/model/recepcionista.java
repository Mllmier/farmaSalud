package model;

import java.time.LocalDate;
import java.util.Date;

public class Recepcionista extends Persona {
    private String codigoEmpleado;
    private LocalDate fechaContratacion;
    private Paciente paciente;
    private Medico medico;
    private String turno;

    public Recepcionista(String codigoEmpleado, LocalDate fechaContratacion, Paciente paciente, Medico medico, String turno, String numeroDocumento, String nombres, String apellidos, LocalDate fechaNacimiento, String sexo, String eps, String email, String celular) {
        super(numeroDocumento, nombres, apellidos, fechaNacimiento, sexo, eps, email, celular);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.paciente = paciente;
        this.medico = medico;
        this.turno = turno;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

   
   
}