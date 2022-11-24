/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import static Utilidades.Comparador.compVotosTUKI;
import entidades.Alumno;
import entidades.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * • La clase Simulador debe tener un método que genere un listado de alumnos
 * manera aleatoria y lo retorne. Las combinaciones de nombre y apellido deben
 * ser generadas de manera aleatoria. Nota: usar listas de tipo String para
 * generar los nombres y los apellidos. • Ahora hacer un generador de
 * combinaciones de DNI posibles, deben estar dentro de un rango real de números
 * de documentos. Y agregar a los alumnos su DNI. Este método debe retornar la
 * lista de dnis. • Ahora tendremos un método que, usando las dos listas
 * generadas, cree una cantidad de objetos Alumno, elegidos por el usuario, y le
 * asigne los nombres y los dnis de las dos listas a cada objeto Alumno. No
 * puede haber dos alumnos con el mismo dni, pero si con el mismo nombre. • Se
 * debe imprimir por pantalla el listado de alumnos. • Una vez hecho esto
 * debemos generar una clase Voto, esta clase tendrá como atributos, un objeto
 * Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 * • Crearemos un método votación en la clase Simulador que, recibe el listado
 * de alumnos y para cada alumno genera tres votos de manera aleatoria. En este
 * método debemos guardar a el alumno que vota, a los alumnos a los que votó y
 * sumarle uno a la cantidad de votos a cada alumno que reciba un voto, que es
 * un atributo de la clase Alumno. Tener en cuenta que un alumno no puede
 * votarse a sí mismo o votar más de una vez al mismo alumno. Utilizar un
 * hashset para resolver esto. • Se debe crear un método que muestre a cada
 * Alumno con su cantidad de votos y cuales fueron sus 3 votos.
 *
 * • Se debe crear un método que haga el recuento de votos, este recibe la lista
 * de Alumnos y comienza a hacer el recuento de votos. • Se deben crear 5
 * facilitadores con los 5 primeros alumnos votados y se deben crear 5
 * facilitadores suplentes con los 5 segundos alumnos más votados. A
 * continuación, mostrar los 5 facilitadores y los 5 facilitadores suplentes.
 */
public class Simulador {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<String> crearNombres(int c) {
        String[] noms = new String[]{"Andrea", "Luis", "Candela", "Fernando", "Florencia", "David", "Gimena", "Marcos", "Cecilia", "Gabriel"};
        String[] aplls = new String[]{"Chiquito", "Guerrero", "Cardenas", "Cardona", "Palermo", "Riquelme", "Maradona", "Castro", "Gonzalez", "Iriarte"};
        ArrayList<String> alms = new ArrayList();
        for (int i = 0; i < c; i++) {
            int r1 = (int) (Math.random() * 10);
            int r2 = (int) (Math.random() * 10);
            alms.add(noms[r1] + " " + aplls[r2]);
        }
        return alms;
    }

    public ArrayList<Integer> crearDNI(int c) {
        ArrayList<Integer> dnis = new ArrayList();
        for (int i = 0; i < c; i++) {
            int dni = (int) ((Math.random() * 30000000) + 20000000);
            while (dnis.contains(dni)) {
                dni = (int) ((Math.random() * 30000000) + 20000000);
            }
            dnis.add(dni);
        }
        return dnis;

    }

    /* • Ahora tendremos un método que, usando las dos listas
 * generadas, cree una cantidad de objetos Alumno, elegidos por el usuario, y le
 * asigne los nombres y los dnis de las dos listas a cada objeto Alumno. No
 * puede haber dos alumnos con el mismo dni, pero si con el mismo nombre. */
    public ArrayList<Alumno> crearAlumnos() {
        int c;
        do {
            System.out.println("cuantos alumnos desea ingresar?(+10, no seas papanatas)");
            c = sc.nextInt();
        } while (c < 10);
        ArrayList<String> nombres = crearNombres(c);
        ArrayList<Integer> dnis = crearDNI(c);
        ArrayList<Alumno> almns = new ArrayList();
        for (int i = 0; i < c; i++) {
            almns.add(new Alumno(nombres.get(i), dnis.get(i),0));
        }
        return almns;
    }

    public void mostrar(ArrayList<Alumno> almns) {
        for (Alumno almn : almns) {
            System.out.println(almn);
        }
    }

    /*• Crearemos un método votación en la clase Simulador que, recibe el listado
 * de alumnos y para cada alumno genera tres votos de manera aleatoria. En este
 * método debemos guardar a el alumno que vota, a los alumnos a los que votó y
 * sumarle uno a la cantidad de votos a cada alumno que reciba un voto, que es
 * un atributo de la clase Alumno. Tener en cuenta que un alumno no puede
 * votarse a sí mismo o votar más de una vez al mismo alumno. Utilizar un
 * hashset para resolver esto.*/
    public ArrayList<Voto> votin(ArrayList<Alumno> almns) {
        ArrayList<Voto> votos = new ArrayList();
        for (int i = 0; i < almns.size(); i++) {
            ArrayList<Alumno> vp = new ArrayList();
            while (vp.size() <= 3) {
                int r = (int) (Math.random() * (almns.size()));
                if (i != r) {
                    vp.add(almns.get(r));
                }

            }
            //ArrayList<Alumno> t = new ArrayList(vp);
            votos.add(new Voto(almns.get(i), vp));

        }

        return votos;
    }

    public void mostrarVotos(ArrayList<Voto> votos) {
        for (Voto voto : votos) {
            System.out.println(voto);
        }
    }

    public void agregarVotos(ArrayList<Alumno> almns, ArrayList<Voto> votos) {
        for (Voto voto : votos) {
            for (int i = 0; i < 3; i++) {
                (voto.getAlmV().get(i)).setVotos((voto.getAlmV().get(i)).getVotos()+1);
            }
        }
    }

    /*Se deben crear 5
 * facilitadores con los 5 primeros alumnos votados y se deben crear 5
 * facilitadores suplentes con los 5 segundos alumnos más votados. A
 * continuación, mostrar los 5 facilitadores y los 5 facilitadores suplentes.*/
    public void facilitadores(ArrayList<Alumno> almns) {
        Alumno[] f1 = new Alumno[5];
        Alumno[] f2 = new Alumno[5];
        Collections.sort(almns, compVotosTUKI);
        for (int i = 0; i < 5; i++) {
            f1[i] = almns.get(i);
            f2[i] = almns.get(i + 5);
        }
        System.out.println("Facilitadores:");
        for (Alumno alumno : f1) {
            System.out.println(alumno);
        }
        System.out.println("Facilitadores suplentes:");
        for (Alumno alumno : f2) {
            System.out.println(alumno);
        }
    }
}
