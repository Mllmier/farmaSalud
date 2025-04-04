/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Maria liz
 */
public class Medico {

    private String codigoEmpleado;
    private Paciente paciente;
    private List<Paciente> pacientesAtendidos;
    private List<Cita> listCitas;

    private Especialidad especialidad;

    enum Especialidad {
        ODONTOLOGO,
        GENERAL,
        OFTAMOLOGIA,
        PSIQUIATRIA,
        CARDIOLOGO

    }

    public Medico(String codigoEmpleado, Persona persona, List<Paciente> pacientesAtendidos, Especialidad especialidad, Paciente paciente, List<Cita>citas) {
        this.codigoEmpleado = codigoEmpleado;
        this.pacientesAtendidos = pacientesAtendidos;
        this.especialidad = especialidad;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public List<Paciente> getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public void setPacientesAtendidos(List<Paciente> pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Cita> getListCitas() {
        return listCitas;
    }

    public void setListCitas(List<Cita> listCitas) {
        this.listCitas = listCitas;
    }
    
    

}
