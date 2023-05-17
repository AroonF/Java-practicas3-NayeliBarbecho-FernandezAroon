/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class Compositor extends Persona {
    //atributos
   private int numeroDeComposiciones;
    //lista de la Clase cancion 
   private ArrayList<Cancion> cancionesTop100;
    //lista de la clase cantante
   private ArrayList<Cantante>clientes;
    //Constructor con parametros

    public Compositor(int numeroDeComposiciones, ArrayList<Cancion> cancionesTop100, ArrayList<Cantante> clientes, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100 = cancionesTop100;
        this.clientes = clientes;
    }
    
//Conatructor vacio
    public Compositor() {
        this.cancionesTop100 = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    //Getters y Setters

    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }
    //Hashcode y Equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.cancionesTop100);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        if (!Objects.equals(this.cancionesTop100, other.cancionesTop100)) {
            return false;
        }
        return true;
    }
    
    public void agregarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos){
        cancionesTop100.add(new Cancion(codigo, titulo, letra, tiempoEnMinutos));
    }
    public void agregarCliente(String nombreArtistico,String generoMusica,int numeroDeSencillos,int numeroDeConciertos,int numeroDeGiras,int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario, ArrayList<Disco> discografia){
        clientes.add(new Cantante(nombreArtistico, generoMusica, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, discografia, codigo, nombre, apellido, edad, nacionalidad, salario));
    }
            
    @Override
    public String toString() {
        return super.toString()+"\nCompositor{" + "numeroDeComposiciones=" + numeroDeComposiciones + ", cancionesTop100=" + cancionesTop100 + ", clientes=" + clientes + '}';
    }

   @Override
    public double calcularSalario() {   
      int numeroDeCanciones = cancionesTop100.size(); 
      double salarioTotal = getSalario();
      if (numeroDeComposiciones > 5) {
           salarioTotal += 
           300;
        }
    if (numeroDeCanciones >= 1 && numeroDeCanciones <= 3) {
            salarioTotal *= 1.1;
        }else if (numeroDeCanciones >= 4 && numeroDeCanciones <= 6) {
            salarioTotal *= 1.2;
        }else if (numeroDeCanciones > 6) {
            salarioTotal *= 1.2;
        }
       return salarioTotal;
    }
}
