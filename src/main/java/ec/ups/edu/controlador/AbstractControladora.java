/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dutan2000
 */
public abstract class AbstractControladora<T> {
    private List<T> lista;
    private T t;
    private int codigo;


    public AbstractControladora() {
        lista = new ArrayList<T>();
        codigo=0;
    }
    
    
    public void create(T objeto){
        lista.add(objeto);
    }
    
    public T read(T obj){
        return lista.stream().filter(objeto -> objeto.equals(obj)).findFirst().get();
    }
    
    public void update(T objeto){
        for (int i = 0; i < lista.size(); i++) {
            T objeto1=lista.get(i);
            if(objeto1.equals(objeto)){
            lista.set(i, objeto);
            t=objeto;
                break;
            }
        }
        
        
    }
    
    public void delete(T objeto){
       T objeto1 = read(objeto);
       if(objeto1!=null)
        lista.remove(objeto1); 
    }
    
    public List<T> findAll(){
        return lista;
    }
    
    public int generarCodigo(){
        int siguientecodigo=++codigo;
        return siguientecodigo;
    }
    
    public T verObjeto(){
        return t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
}
