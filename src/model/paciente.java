package model;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private String tipoSangre;
    private String alergias;
    private List<Cita> citas;
    private List<HistoriaMedica> historialMedico;

    public Paciente(String numeroDocumento, String nombres, String apellidos) {
        super(numeroDocumento, nombres, apellidos);
        this.citas = new ArrayList<>();
        this.historialMedico = new ArrayList<>();
    }

    public void agregarCita(Cita cita) {
        this.citas.add(cita);
    }

    public void agregarHistoriaMedica(HistoriaMedica historia) {
        this.historialMedico.add(historia);
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public List<HistoriaMedica> getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(List<HistoriaMedica> historialMedico) {
        this.historialMedico = historialMedico;
    }

    
}