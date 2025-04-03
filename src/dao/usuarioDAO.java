/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Rol;
import model.usuario;

/**
 *
 * @author Maria liz
 */
public class usuarioDAO {
    
    //admin creado con email y password
    private static final usuario usuario_predeterminado = new usuario("maria@gmail.com ", "karen123", rol.ADMINISTRADOR);
    
    public usuario validarCredenciales(String email, String password) {
        return usuario_predeterminado;
    }
    
}
