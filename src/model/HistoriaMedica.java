package model;

import farmasalud.view.Doctor;
import java.util.Date;

public class HistoriaMedica {
    private String antecedentes;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;
    private Date fechaCreacion;
    private Paciente paciente;
    private Doctor doctor;

    public HistoriaMedica(Paciente paciente, Doctor doctor) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fechaCreacion = new Date();
    }

    
}