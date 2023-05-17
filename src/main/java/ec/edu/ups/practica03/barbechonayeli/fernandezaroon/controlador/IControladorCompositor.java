/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador;

import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Compositor;



/**
 *
 * @author LENOVO
 */
public interface IControladorCompositor {
   public int MAX_OBJECTS=10;
   public abstract Compositor create(Object obj);
   public abstract Compositor read(Object obj);
   public abstract Compositor update(Object obj);
   public abstract Compositor delete(Object obj);
   public abstract void list();
    
}
