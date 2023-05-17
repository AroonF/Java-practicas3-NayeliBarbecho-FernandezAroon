/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador;


import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Cancion;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Cantante;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Compositor;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Disco;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ControladorPersona implements IControlador{
    private List<Persona> personas;

    public ControladorPersona() {
        personas = new ArrayList<>();    
    }

    public void list() {
        for(Persona persona : personas){
            System.out.println(persona.toString());
        }
    }

    @Override
    public Persona create(Object obj) {
        if (obj instanceof Persona) {
            personas.add((Persona) obj);
        }
        return null;
    }

    @Override
    public Persona update(Object obj) {
        if (obj instanceof Persona) {
            String cedula = ((Persona) obj).getNombre();
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if (persona.getNombre().equals(cedula)) {
                    personas.set(i, (Persona) obj);
                }
            }
        }
        return null;
    }

    @Override
    public Persona read(Object obj) {
        String cedula = (String) obj;
        for (Persona persona : personas) {
           if (persona.getNombre().equals(cedula)) {
               return persona;
           }
        }
        return null;
    }

    @Override
    public Persona delete(Object obj) {
        if (obj instanceof Persona) {
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if (persona.equals((Persona) obj)) {
                    personas.remove(i);
                }
            }
        }
        return null;
    }
    @Override
    public void imprimir(){
         for(Persona persona: personas){
         System.out.println(persona.toString()); 
        }
    }   
}