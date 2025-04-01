/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Maria liz
 */
public class medicamento {
    private int idMedicamento;
    private String nombre;
    private  int cantidad;
    private String lote;
    private Date fechaVencimiento;
    //private Inventario inventario;
    private boolean verificarDisponibilidad;
    private boolean verificarVencimiento;
    private boolean estadoMedicamento;
}
