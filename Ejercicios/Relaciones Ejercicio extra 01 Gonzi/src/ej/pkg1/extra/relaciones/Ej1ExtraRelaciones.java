package ej.pkg1.extra.relaciones;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.AdopcionServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej1ExtraRelaciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> mascotas = new ArrayList();
        AdopcionServicio as = new AdopcionServicio();

        do {
            mascotas.add(as.generarPerro());
            System.out.println("Quiere continuar agregando Perros? [si] / [no]");
        } while (!leer.next().equalsIgnoreCase("no"));

        do {
            personas.add(as.generarPersona(mascotas));
            System.out.println("Quiere continuar agregando personas? [si] / [no]");
            if (leer.next().equalsIgnoreCase("no")) {
                break;
            }
        } while (!mascotas.isEmpty());

        if (mascotas.isEmpty()) {
            System.out.println("Nos quedamos sin mascotas");
            System.out.println("Vuelva otro dia!");
        } else {
            System.out.println("Los Perros que quedaron sin dueño son: ");
            for (Perro aux : mascotas) {
                System.out.println(aux);
            }
        }
        
        System.out.println("Las personas que adoptaron son: ");
        for (Persona aux : personas) {
            System.out.println(aux);
        }

    }
}
