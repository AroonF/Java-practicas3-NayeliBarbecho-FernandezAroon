/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador;



import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Compositor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ControladorCompositor implements IControladorCompositor{
     private List<Compositor> compositores;

    public ControladorCompositor() {
        compositores=new ArrayList<>();
    }

    @Override
    public Compositor create(Object obj) {
        if(obj instanceof Compositor) { 
            compositores.add((Compositor) obj); 
        }
        return null;
    }

    @Override
    public Compositor read(Object obj) {
        String cedula = (String) obj;
        for (Compositor compositor : compositores) {
           if (compositor.getNombre().equals(cedula)) {
               return compositor;
           }
        }
        return null;
    }

    @Override
    public Compositor update(Object obj) {
        if (obj instanceof Compositor) {
            String cedula = ((Compositor) obj).getNombre();
            for (int i = 0; i < compositores.size(); i++) {
                Compositor cantante = compositores.get(i);
                if (cantante.getNombre().equals(cedula)) {
                    compositores.set(i, (Compositor) obj);
                }
            }
        }
        return null;
    }

    @Override
    public Compositor delete(Object obj) {
        if (obj instanceof Compositor) {
            for (int i = 0; i < compositores.size(); i++) {
                Compositor compositor = compositores.get(i);
                if (compositor.equals((Compositor) obj)) {
                    compositores.remove(i);
                }
            }
        }
        return null;
    }

    @Override
    public void list() {
        for(Compositor compositor: compositores){
         System.out.println(compositor.toString()); 
        }
    }   
}