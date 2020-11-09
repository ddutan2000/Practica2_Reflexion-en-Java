/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.test;

import ec.ups.edu.controlador.*;
import ec.ups.edu.modelo.Telefono;
import ec.ups.edu.modelo.Usuario;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dutan2000
 */
public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ControladorTelefono controladorT = new ControladorTelefono();
        ControladorUsaurio controladorU = new ControladorUsaurio(controladorT);

        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("BIENVENIDO AL PROGRAMA DE DENYS \nQUE DESEA HACER?");
            System.out.println("1.REGISTRAR USUARIO");
            System.out.println("2.INICIAR SESSION");
            System.out.println("3.BUSCAR INFORMACIO DE USUARIO");
            System.out.println("4.SALIR");

            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("INGRESE SUS DATOS: \nID: \nCEDULA: \nNOMBRE: \nAPELLIDO: \nCORREO: \nCONTRASEÑA: ");
                        int id = input.nextInt();
                        String cedula = input.next();
                        String nombre = input.next();
                        String apellido = input.next();
                        String correo = input.next();
                        String contrasenia = input.next();
                        Usuario u = new Usuario(id, cedula, nombre, apellido, correo, contrasenia);
                        controladorU.create(u);
                        System.out.println("USUARIO CREADO EXITOSAMENTE");
                        break;

                    case 2:
                        System.out.println("INGRESE SU CORREO Y CONTRASEÑA:");
                        String correo1 = input.next();
                        String contrasenia1 = input.next();
                        if (controladorU.autenticar(correo1, contrasenia1) != null) {
                            System.out.println("BIENVENIDO \nQUE DESEA HACER? ");
                            int opcion1;
                            boolean salir1=false;
                            while(!salir1){
                                try {
                                    System.out.println("1.Registrar Telelfono \n2.modificarTelelfono \n3.eliminarTelelfono \n4.listar telefonos \n5.salir ");
                                    opcion1=input.nextInt();
                                    
                                    switch(opcion1){
                                        case 1:
                                            System.out.print("Ingrese codigo: ");
                                            int codigo=input.nextInt();
                                            System.out.print("Ingrese numero de telefono: ");
                                            String numero=input.next();
                                            System.out.println("Ingrese tipo de telelfono: ");
                                            String tipo=input.next();
                                            System.out.println("Ingrese tipo de operadora: ");
                                            String operadora= input.next();
                                            Telefono t=new Telefono(codigo, numero, tipo, operadora);
                                            controladorT.create(t);
                                            controladorU.crearTelefono(t);
                                            System.out.println("Telefono Creado exitosamente");
                                            break;
                                            
                                        case 2: 
                                            System.out.print("Ingrese codigo: ");
                                            int codigo1=input.nextInt();
                                            System.out.print("Ingrese numero de telefono: ");
                                            String numero1=input.next();
                                            System.out.println("Ingrese tipo de telelfono: ");
                                            String tipo1=input.next();
                                            System.out.println("Ingrese tipo de operadora: ");
                                            String operadora1= input.next();
                                            Telefono t1=new Telefono(codigo1, numero1, tipo1, operadora1);
                                            controladorU.actualizarTelefono(t1);
                                            controladorT.update(t1);
                                            System.out.println("Telefono actualizado exitosamente");
                                            break;
                                            
                                        case 3:
                                            System.out.print("Ingrese codigo: ");
                                            int codigo2=input.nextInt();
                                            System.out.print("Ingrese numero de telefono: ");
                                            String numero2=input.next();
                                            System.out.print("Ingrese tipo de telelfono: ");
                                            String tipo2=input.next();
                                            System.out.print("Ingrese tipo de operadora: ");
                                            String operadora2= input.next();
                                            Telefono t2=new Telefono(codigo2, numero2, tipo2, operadora2);
                                            controladorU.deleteTelefono(t2);
                                            controladorT.delete(t2);
                                            System.out.println("Telefono eliminado exitosamente");
                                            break;
                                            
                                        case 4:
                                            System.out.println(controladorU.listaDeTelelfonos());
                                            break;
                                            
                                        case 5:
                                            salir1=true;
                                            break;
                                            
                                        default:
                                            System.out.println("debe ingresar opciones solamente entre 1-4");
                                            break;
                                    }
                                    
                                } catch (InputMismatchException e) {
                                    System.out.println("solo debe ingresar numeros");
                                    input.next();
                                }
  
                            }
                            
                        } else {
                            System.out.println("CORREO O CONTRASEÑA EQUIVOCADO");
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese la cedula del usuario que desea buscar");
                        int buscar=input.nextInt();
                        Usuario u2=new Usuario(buscar, null, null, null, null, null);
                        Usuario u3 =controladorU.read(u2);
                        System.out.println(u3);
                        System.out.println(u3.listarTelefonos());
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("DEBE INGRESAR SOLAMENTE NUMEROS ENTRE 1-3");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("SOLO DEBE INGRESAR NUMEROS");
                input.next();
            }

        }

    }
}
