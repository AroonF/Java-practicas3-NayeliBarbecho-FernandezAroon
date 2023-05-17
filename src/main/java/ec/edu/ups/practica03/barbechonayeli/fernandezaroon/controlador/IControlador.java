/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador;

import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Cantante;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Compositor;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Persona;
import java.util.List;




/**
 *
 * @author LENOVO
 */
public interface  IControlador {
    public int MAX_OBJECTS=10;
    public abstract Persona create(Object obj);
    public abstract Persona update(Object obj);
    public abstract Persona read(Object obj);
    public abstract Persona delete(Object obj);
    public abstract void imprimir();
   
        
    
   
}
