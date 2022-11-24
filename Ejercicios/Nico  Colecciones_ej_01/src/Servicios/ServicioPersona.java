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
import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona per1 = new Persona();
    Persona per2 = new Persona();

    public Persona crearPersona(Perro p1) {

        System.out.println("Ingresamos los datos de la primera persona: ");
        System.out.println("Nombre");
        per1.setNombre(leer.next());
        System.out.println("Apellido");
        per1.setApellido(leer.next());
        System.out.println("Edad");
        per1.setEdad(leer.nextInt());
        System.out.println("Documento");
        per1.setDocumento(leer.nextInt());
        per1.setPerro(p1);
        return per1;
    }
    public Persona crearPersona2(Perro p2){
           System.out.println("Ingresamos los datos de la segunda persona: ");
        System.out.println("Nombre");
        per2.setNombre(leer.next());
        System.out.println("Apellido");
        per2.setApellido(leer.next());
        System.out.println("Edad");
        per2.setEdad(leer.nextInt());
        System.out.println("Documento");
        per2.setDocumento(leer.nextInt());
        per2.setPerro(p2);
        return per2;
    }
}
