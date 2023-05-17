/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador;

import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Cantante;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Disco;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface IControladorCantante {
   public int MAX_OBJECTS=10;
   public abstract Cantante create(Object obj);
   public abstract Cantante read(Object obj);
   public abstract Cantante update(Object obj);
   public abstract Cantante delete(Object obj);
   public abstract void list();
}
