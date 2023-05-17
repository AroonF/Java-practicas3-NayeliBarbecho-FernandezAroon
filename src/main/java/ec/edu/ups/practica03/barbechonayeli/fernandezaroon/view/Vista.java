/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.view;

import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador.ControladorCantante;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador.ControladorCompositor;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador.ControladorPersona;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador.IControlador;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador.IControladorCantante;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador.IControladorCompositor;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Cantante;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Compositor;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Persona;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Vista {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Menu");
        IControladorCantante controlador= new ControladorCantante();
        IControladorCompositor controlador1=new ControladorCompositor();
        Compositor com1= new Compositor();
        Compositor com2= new Compositor();
        com1.setNombre("Pedro");
        com1.setApellido("Elizalde");
        com1.setCodigo(145);
        com1.setNacionalidad("Peruano");
        com1.setEdad(23);
        com1.setNumeroDeComposiciones(4);
        com1.agregarCancion(374, "Beso", "n789", 2);
        com1.setSalario(600);
        System.out.println("Salario cantante 1: " + com1.calcularSalario());
        com2.setNombre("Miguel");
        com2.setApellido("Torres");
        com2.setCodigo(147);
        com2.setNacionalidad("Cubano");
        com2.setEdad(25);
        com2.setNumeroDeComposiciones(6);
        com2.agregarCancion(367, "Cielo", "n755", 5);
        com2.setSalario(700);
        System.out.println("Salario compositor 2: " + com2.calcularSalario());
        Cantante cl1=new Cantante();
        Cantante c2=new Cantante();
        c2.setNombre("Miguel");
        c2.setNombreArtistico("JDK");
        c2.setApellido("Perez");
        c2.setCodigo(125);
        c2.setEdad(34);
        c2.setNacionalidad("Ecuatoriano");
        c2.setNumeroDeConciertos(3);
        c2.setNumeroDeGiras(2);
        c2.setNumeroDeSencillos(4);
        c2.setGeneroMusica("Reggae");
        c2.setSalario(500);
        System.out.println("Salario cantante1: " + c2.calcularSalario());
        c2.agregarDisco(234, "Zoe", "2004");
        cl1.setNombre("Pepito");
        cl1.setNombreArtistico("DJK");
        cl1.setApellido("Piedra");
        cl1.setCodigo(124);
        cl1.setEdad(34);
        cl1.setNacionalidad("Ecuatoriano");
        cl1.setNumeroDeConciertos(3);
        cl1.setNumeroDeGiras(2);
        cl1.setNumeroDeSencillos(4);
        cl1.setGeneroMusica("Pop");
        cl1.setSalario(500);
        cl1.agregarDisco(234, "Luna", "2006");
        System.out.println("Salario cliente: " + cl1.calcularSalario());
        int opcion =0;
        
        do{
            System.out.println("1.Ingreso de Cantante");
        System.out.println("2.Ingreso de Compostitor");
        System.out.println("3.Agregar Clientes");
        System.out.println("4.Imprimir persona");
        System.out.println("5.Busqueda de cantante por nombre de disco");
        System.out.println("6. Busqueda de compositor por nombre de cancion");
        System.out.println("7.Actualizar apellido cantante 1");
        System.out.println("8.Eliminar cantante c1");
        System.out.println("9.Salir");
        System.out.println("Por favor ingrese la opcion");
            opcion=teclado.nextInt();
        
    
    
        switch(opcion){
            
            case 1:
                System.out.println("Cantante  creado");
                
                controlador.create(c2);
                
                System.out.println(c2);
                break;
            case 2:
                System.out.println("Compositor 1 y 2 creados");
                controlador.create(com1);
                controlador.create(com2);
                System.out.println(com1);
                System.out.println(com2);
                break;
            case 3:
                System.out.println("Cliente  agregado");
                controlador.create(cl1);
                System.out.println(cl1);
                
                break;
            case 4:
                System.out.println("Listar todos");
                controlador.create(cl1);
                controlador.create(c2);
                controlador.create(com1);
                controlador.create(com2);
                controlador.list();
                break;
            case 5:
                System.out.println("Buscar cantante por nombre de disco"); 
                controlador.create(cl1);
                controlador.create(c2);
                System.out.println(controlador.read("Luna")); 
                break;
            case 6:
                System.out.println("Buscar compositor por nombre de cancion");
                
                System.out.println(controlador1.read("Beso")); 
                break;
            case 7:
                System.out.println("Actualizar apellido cliente 1 "); 
                controlador.create(cl1);
                controlador.create(c2);
                cl1.setApellido("Fernandez"); 
                controlador.list();
                controlador1.list();
                break;
            case 8:
                System.out.println("Eliminar cliente cl1"); 
                System.out.println("Eliminar compositor com1"); 
                controlador.create(cl1);
                controlador.create(c2);
                controlador.delete(cl1); 
                controlador.list();
                controlador1.list();
                break;   
            }
        }
        while(opcion!=9);
        System.out.println("Programa finalizado");
    }
}
    