/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package colleccion3.servicio;

import colleccion3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class servicioAlumno {

    private Scanner leer;
    private ArrayList<Alumno> not;

    public servicioAlumno() {
        not = new ArrayList<>();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    private Alumno crearAlumno() {
        Alumno alum = new Alumno();
        
//        Alumno alum1 = new Alumno("raul", 9, 9, 8, ((double) (9 + 9 + 8) / 3));
//        Alumno alum2 = new Alumno("marcelo", 9, 8, 9, ((double) (9 + 8 + 9) / 3));
//        Alumno alum3 = new Alumno("pablo", 7, 8, 9, ((double) (7 + 8 + 9) / 3));
//        not.add(alum1);
//        not.add(alum2);
//        not.add(alum3);

        System.out.println("ingrese el nombre el alumno");
        alum.setNombre(leer.next().toUpperCase());
        System.out.println("ingrese la primer nota del alumno");
        alum.setNota1(leer.nextInt());
        System.out.println("ingrese la segunda nota del alumno");
        alum.setNota2(leer.nextInt());
        System.out.println("ingrese la tercer nota del alumno");
        alum.setNota3(leer.nextInt());
        not.add(alum);
        alum.setNotaFinal((double) (alum.getNota1() + alum.getNota2() + alum.getNota3()) / 3);
        return alum;

    }

    public void llenarListaAlumnos() {
        String pala;

        do {
        crearAlumno();
            System.out.println("desea agregar un alumno?(s/n)");
            pala = leer.next();
        } while (pala.equalsIgnoreCase("s"));

    }

    public void mostrarNotaFinal() {
        System.out.println("Ingrese el nombre del alumno a calcular la nota final:");
        String notaF = leer.next().toUpperCase();
        for (Alumno aux : not) {
            if (aux.getNombre().equalsIgnoreCase(notaF)) {
                System.out.println("la nota final de " + aux.getNombre().toUpperCase() + " es: " + aux.getNotaFinal().floatValue());
            }
        }
    }

    public void imprimir() {
        for (Alumno aux : not) {
            System.out.println(aux);

        }
//        System.out.println("**************************");
//        System.out.println(Collections.synchronizedList(not));
    }
}
