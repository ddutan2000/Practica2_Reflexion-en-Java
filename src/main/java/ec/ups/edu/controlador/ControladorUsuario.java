/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.modelo.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dutan2000
 */
public class ControladorUsuario extends AbstractControladora<Usuario>{
     private List<Usuario> usuarios;
     private Usuario usuario;
     //private Telefono telefono;
     //private ControladorTelefono controladorT;

    public ControladorUsuario() {
        //controladorT=controladorTelefono;
            usuarios=super.findAll();
    }
    /*
    public Usuario autenticar(String correo, String contrasenia){
        for (Usuario usuario1 : usuarios) {
            if(usuario1.getCorreo().equals(correo)&& usuario1.getContrasenia().equals(contrasenia)){
                usuario=usuario1;
                super.setT(usuario);
                return usuario1;
            }
        }
        return null;
    }*/
    
    public Usuario imprimirUsuarioReflexion(String correo,String contrasenia){
        for (Object object : usuarios) {
            Method[] metodos = object.getClass().getMethods();
            for(Method m: metodos){
                if (m.getName().equals("getCorreo")){
                    try {
                        if(m.invoke(object, null).equals(correo)){
                            for (Method m1 : metodos) {
                                if(m1.getName().equals("getContrasenia")){
                                    if(m1.invoke(object, null).equals(contrasenia)){
                                        usuario=(Usuario)object;
                                        super.setT(usuario);
                                        return (Usuario)object;
                                    }       
                                }
                            }
                        }
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return null;
    }
    
    
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
