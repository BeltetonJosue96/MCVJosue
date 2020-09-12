/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Belteton
 */
public class RegistroAlumnos {
   private String noCarne;
   
   private String nombre;
   
   private String apellidos;
   
   private String correo;
   
   private String telefono;
   
   private String direccion;

   
    public RegistroAlumnos(String numeroCarne, String nombre, String apellido, String correo, String telefono, String direccion) {
        this.noCarne = noCarne;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    
    public String getNoCarne() {
        return noCarne;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
   

}
