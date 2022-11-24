/*
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
--------------------------------------------------------------------------------------------------------
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package Servicio;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class JuegoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Revolver r = new Revolver();
    ArrayList<Jugador> jugadores = new ArrayList();

    public void llenarRevolver() {
        r.setAgua((int) (Math.random() * 10));
        r.setDisparo((int) (Math.random() * 10));

        System.out.println("Posición del agua: " + r.getAgua());
        System.out.println("Posición del disparo: " + r.getDisparo());
    }

    public boolean mojar() {

        boolean mojado = false;

        if (r.getAgua() == r.getDisparo()) {

            mojado = true;
        }

        return mojado;
    }

    public void siguienteChorro() {

        System.out.println(r.getDisparo());
        if (r.getDisparo() == 9) {
            r.setDisparo(0);
        } else {
            r.setDisparo(r.getDisparo() + 1);
        }
    }

    public void alString() {
        System.out.println(toString());
    }

    public void empezar() {

        int cantidad = 0;
        int cont = 0;
        String unidos;
        System.out.println("Quiere ingresar la cantidad de jugadores?");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("si")) {
            while (cantidad > 6 || cantidad < 1) {
                System.out.println("Ingrese la cantidad de jugadores");
                cantidad = leer.nextInt();
            }
        } else if (cantidad == 0) {
            cantidad = 6;
        }
        do {
            Jugador j = new Jugador();
            System.out.println("Ingrese el nombre del jugador " + (cont + 1));
            j.setNombre(leer.next());
            j.setId(cont + 1);
            cont++;

            jugadores.add(j);

        } while (cantidad != jugadores.size());

        for (Jugador var : jugadores) {
            System.out.println(var);
        }
    }
    int cont = 0, contar = 0;

    public boolean disparo() {

        boolean mojado = false;
        do {
            mojar();
            siguienteChorro();
            if (contar > jugadores.size() - 1) {
                contar = 0;
            }
            System.out.println(jugadores.get(contar).getNombre());
            contar++;
        } while (!mojar());

        if (contar > jugadores.size() - 1) {
            contar = 0;
        }
        jugadores.get(contar).setMojado(true);
        mojado = true;
        if (jugadores.get(contar).isMojado()) {
            System.out.println("-------------------------------------");
            System.out.println("Te cagaste en los pantalones!!!!");
            System.out.println(jugadores.get(contar).getNombre());
            System.out.println("-------------------------------------");
        }
        return mojado;
    }

}
