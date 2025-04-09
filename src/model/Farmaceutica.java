/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author HP
 */
public class Farmaceutica extends Persona {
     private List<Medicamento>medicamentosDisponibles;
     private List<Medicamento>medicamentosEntregados;

    
   public Farmaceutica(String numeroDocumento, String nombres, String apellidos,LocalDate fechaNacimiento,String sexo,String eps,String email,String celular){
   super(numeroDocumento, nombres, apellidos, fechaNacimiento, sexo, eps, email, celular);
   this.medicamentosDisponibles=new ArrayList<>();
   this.medicamentosEntregados= new ArrayList<>();
   }

    
    
    public List<Medicamento> getMedicamentosDisponibles() {
        return medicamentosDisponibles;
    }

    public void setMedicamentosDisponibles(List<Medicamento> medicamentosDisponibles) {
        this.medicamentosDisponibles = medicamentosDisponibles;
    }

    public List<Medicamento> getMedicamentosEntregados() {
        return medicamentosEntregados;
    }

    public void setMedicamentosEntregados(List<Medicamento> medicamentosEntregados) {
        this.medicamentosEntregados = medicamentosEntregados;
    }
    
   
    
    
}
