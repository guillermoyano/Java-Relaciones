/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package javaapplication39;

import Servicios.ServicioPerro;
import Servicios.ServicioPersona;

/**
 *
 * @author Pergo
 */
public class Relaciones_ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPerro ps = new ServicioPerro();
        ServicioPersona perS = new ServicioPersona();
        
        System.out.println(perS.crearPersona(ps.cargarPerro()));
        
        
        System.out.println(perS.crearPersona2(ps.cargarPerro2()));
        
        
        
        

    }

}
