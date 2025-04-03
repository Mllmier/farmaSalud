/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;
/**
 *
 * @author HP
 */
public class Doctor extends Persona{
    private String especialidad;
    private List<Cita>citas;
//    private List<OrdenMedica> ordenmedica;

    
    public Doctor(String numeroDocumento, String nombres, String apellidos) {
        super(numeroDocumento, nombres, apellidos);
         this.citas = new ArrayList<>();
       //  this.ordenmedica=new ArrayList<>();        
    }
    
    public void mostarCita(Cita cita) {
      this.citas.add(cita);
    }

 /*   public void mostrarOrdenMedica(OrdenMedica orden) {
        this.ordenmedica.add(orden);
    }*/

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

  /*  public List<OrdenMedica> getOrdenmedica() {
        return ordenmedica;
    }

    public void setOrdenmedica(List<OrdenMedica> ordenmedica) {
        this.ordenmedica = ordenmedica;
    }*/

   
    
    
    
}
