/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Servicios;

import Entidades.Perro;
import java.util.Scanner;

public class ServicioPerro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Perro p1 = new Perro();
    Perro p2 = new Perro();

    public Perro cargarPerro() {

        System.out.println("Ingrese los datos del primer perro: ");
        System.out.println("Ingrese el nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad: ");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese la raza");
        p1.setRaza(leer.next());
        System.out.println("Ingrese el tamaño");
        p1.setTamanio(leer.nextInt());
        return p1;
    }

    public Perro cargarPerro2() {
        System.out.println("Ingrese los datos del segundo perro: ");
        System.out.println("Ingrese el nombre: ");
        p2.setNombre(leer.next());
        System.out.println("Ingrese la edad: ");
        p2.setEdad(leer.nextInt());
        System.out.println("Ingrese la raza");
        p2.setRaza(leer.next());
        System.out.println("Ingrese el tamaño");
        p2.setTamanio(leer.nextInt());
        return p2;
    }
}
