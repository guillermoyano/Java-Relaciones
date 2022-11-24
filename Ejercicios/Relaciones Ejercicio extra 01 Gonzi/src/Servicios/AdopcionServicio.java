package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import Numeradores.Tamanio;
import java.util.ArrayList;
import java.util.Scanner;

public class AdopcionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    ArrayList<Persona> personas = new ArrayList();
//    ArrayList<Perro> mascotas = new ArrayList();
    Perro p;

    public Persona generarPersona(ArrayList<Perro> perros) {
        p = new Perro();
        System.out.println("Generar Persona");
        System.out.println("Ingrese el nombre de la Persona");
        String nombre = leer.next();
        System.out.println("Ingrese el Apellido");
        String apellido = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese el Documento");
        int documento = leer.nextInt();
        System.out.println("Hola " + nombre);
        System.out.println("Los perros para adoptar son: ");
        for (Perro aux : perros) {
            System.out.println(aux);
        }
        System.out.println("Cual desea adoptar (Ingrese el nombre)");
        String nomb = leer.next();
        for (Perro aux : perros) {

            if (aux.getNombre().equalsIgnoreCase(nomb)) {
                p = perros.get(perros.indexOf(aux));
                perros.remove(p);
                break;
            }
        }
        return new Persona(nombre, apellido, edad, documento, p);
    }

    public Perro generarPerro() {
        System.out.println("Generar Perro");
        p = new Perro();
        System.out.println("Ingrese el nombre del Perro");
        p.setNombre(leer.next());
        int num;
        do {
            System.out.println("Ingrese el tamaño");
            System.out.println("1 - Chico");
            System.out.println("2 - Mediano");
            System.out.println("3 - Grande");
            System.out.println("4 - Moloso");

            num = leer.nextInt();
            switch (num) {
                case 1:
                    p.setTamanio(Tamanio.CHICO);
                    break;
                case 2:
                    p.setTamanio(Tamanio.MEDIANO);
                    break;
                case 3:
                    p.setTamanio(Tamanio.GRANDE);
                    break;
                case 4:
                    p.setTamanio(Tamanio.MOLOSO);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (num < 1 || num > 4);

        System.out.println("Ingrese la Raza");
        p.setRaza(leer.next());

        System.out.println("Ingrese la Edad");
        p.setEdad(leer.nextInt());
        return p;
    }
}
