/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.modelo.Telefono;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class ControladorTelefono extends AbstractControladora<Telefono>{
    private List<Telefono> telefonos;

    public ControladorTelefono() {
        telefonos= super.findAll();
    }
    
    
    
}
