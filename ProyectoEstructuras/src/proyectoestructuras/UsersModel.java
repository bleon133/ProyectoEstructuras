/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructuras;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author brot3
 */
public class UsersModel implements Serializable{
    private String id;
    private String contrasena;
    private String nombres;
    private String apellidos;
    private String correo;
    private String rol;
    private List<String> listHoras;

    // Constructor vacío
    public UsersModel() {
        
    }

    public UsersModel(String id, String contrasena, String nombres, String apellidos, String correo, String rol, List<String> listHoras) {
        this.id = id;
        this.contrasena = contrasena;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.rol = rol;
        this.listHoras = listHoras;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<String> getListHoras() {
        return listHoras;
    }

    public void setListHoras(List<String> listHoras) {
        this.listHoras = listHoras;
    }
}
