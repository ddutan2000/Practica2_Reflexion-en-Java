/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public abstract class AbstractControladora<T> {
    private List<T> lista;
    private T t;


    public AbstractControladora() {
        lista = new ArrayList<T>();
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
        lista.add(i, objeto);
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
    
}