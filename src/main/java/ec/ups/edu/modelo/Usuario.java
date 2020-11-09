/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class Usuario {
    private int id; 
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private List<Telefono> telefonos;

    public Usuario() {
        telefonos=new ArrayList<>();
        
    }

    public Usuario(int id, String cedula, String nombre, String apellido, String correo, String contrasenia) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        telefonos=new ArrayList<>();
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public void createTelefono(Telefono telefono){
        telefonos.add(telefono);
    }
    
    public Telefono readTelefono(Telefono telefono){
        for (Telefono telefono1 : telefonos) {
            if (telefono1.getCodigo()==telefono.getCodigo()){
                return telefono1;
            }
        }
        return null;
    }
    
    public void updateTelefono(Telefono telefono){
        for (int i = 0; i < telefonos.size(); i++) {
            Telefono telefono1 =telefonos.get(i);
            if(telefono1.getCodigo()==telefono.getCodigo()){
                telefonos.set(i, telefono);
                break;
            }
        }
    }
    
    public void deleteTelefono(Telefono telelfono){
        Telefono telefono1=readTelefono(telelfono);
        if(telefono1!=null){
            telefonos.remove(telelfono);
        }
    }
    
    public List<Telefono> listarTelefonos(){
        return telefonos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasenia=" + contrasenia + ", telefonos=" + telefonos + '}';
    }
}
