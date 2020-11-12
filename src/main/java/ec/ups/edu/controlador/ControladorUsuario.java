/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.modelo.*;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class ControladorUsuario extends AbstractControladora<Usuario>{
     private List<Usuario> usuarios;
     private Usuario usuario;
     //private Telefono telefono;
     private ControladorTelefono controladorT;

    public ControladorUsuario() {
        //controladorT=controladorTelefono;
            usuarios=super.findAll();
    }
    
    public Usuario autenticar(String correo, String contrasenia){
        for (Usuario usuario1 : usuarios) {
            if(usuario1.getCorreo().equals(correo)&& usuario1.getContrasenia().equals(contrasenia)){
                usuario=usuario1;
                super.setT(usuario);
                return usuario1;
            }
        }
        return null;
    }
    
    /*public Usuario verUsuario(){
        return usuario=super.verObjeto();
    }*/
    
    public void crearTelefono(Telefono telefono){
        usuario.createTelefono(telefono);
        super.update(usuario);
    } 

    public void actualizarTelefono(Telefono telefono){
        usuario.updateTelefono(telefono);
        super.update(usuario);
    }
    
    public void deleteTelefono(Telefono telefono1){
        //this.telefono=controladorT.read(telefono1);
        usuario.deleteTelefono(telefono1);
        super.update(usuario);
    }
    
    public Collection<Telefono> listaDeTelelfonos(){
        return usuario.listarTelefonos();
    }
  
}
