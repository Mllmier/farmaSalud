/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Maria liz
 */
public class usuario {
    private String email;
    private String password;
    private rol role; //accedes al rol

    public usuario(String email, String password, rol role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public rol getRole() {
        return role;
    }

    public void setRole(rol role) {
        this.role = role;
    }
    
    
}
