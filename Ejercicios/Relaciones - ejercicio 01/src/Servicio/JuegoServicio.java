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
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class JuegoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Revolver r = new Revolver();

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

        ArrayList<Jugador> jugadores = new ArrayList();
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

    public boolean disparo() {

        boolean mojado =false;
        do {
            mojar();
            siguienteChorro();
        } while (mojar() == false);

        if (mojar()== true){
            mojado= true;
            System.out.println("-------------------------------------");
            System.out.println("Te cagaste en los pantalones!!!!");
            System.out.println("-------------------------------------");
        }
        
        return mojado;
    }

}

/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego
 */
