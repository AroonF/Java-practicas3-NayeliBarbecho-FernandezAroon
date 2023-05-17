/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador;

import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Cantante;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ControladorCantante implements IControladorCantante{
    List<Cantante> cantantes;

    public ControladorCantante() {   
        cantantes=new ArrayList<>();
    }
    
    @Override
    public Cantante create(Object obj) {
        if(obj instanceof Cantante) { 
            
            cantantes.add((Cantante) obj); 
        }
        return null;
    }
        
    @Override
    public Cantante read(Object obj) {
         String cedula = (String) obj;
        for (Cantante cantante : cantantes) {
           if (cantante.getNombre().equals(cedula)) {
               return cantante;
           }
        }
        return null;
    }

    @Override
    public Cantante update(Object obj) {
        if (obj instanceof Cantante) {
            String cedula = ((Cantante) obj).getNombre();
            for (int i = 0; i < cantantes.size(); i++) {
                Cantante cantante = cantantes.get(i);
                if (cantante.getNombre().equals(cedula)) {
                    cantantes.set(i, (Cantante) obj);
                }
            }
        }
        return null;
    }

    @Override
    public Cantante delete(Object obj) {
        if (obj instanceof Cantante) {
            for (int i = 0; i < cantantes.size(); i++) {
                Cantante cantante = cantantes.get(i);
                if (cantante.equals((Cantante) obj)) {
                    cantantes.remove(i);
                }
            }
        }
        return null;
    }

    @Override
    public void list() {
        for(Cantante cantante: cantantes){
         System.out.println(cantante.toString()); 
        }
    } 
}