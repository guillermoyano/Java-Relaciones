/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son 
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en 
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta 
ocupado se muestra una X, sino un espacio vacío
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos
 */
package relaciones.ejercicio.extra.pkg02;

import Entidades.Personas;
import Servicio.CineServicio;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class RelacionesEjercicioExtra02 {

    public static void main(String[] args) {

        LinkedList<Personas> personas = new LinkedList();
        CineServicio s1 = new CineServicio();
        Personas p = new Personas();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cont=0;
        s1.abrirSala();

        int opcion;

        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Comprar Entradas");
            System.out.println("2 - Mostrar Sala");
            System.out.println("3 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                   if (personas.size()<s1.sallallena()){
                       String comprar ;
                       do {
                        personas.add(s1.crearPersona(personas));
                        if (s1.corroborar()==true){
                            personas.remove(personas.getLast());
                            break;
                        }else if (s1.corroborar()==false){
                            s1.mostrarSala();
                            System.out.println("Elegí donde te queres sentar chango!");
                             s1.modificarSala();
                            
                        }
                           System.out.println("Quiere comprar otra entrada? [SI]  /  [NO]");
                           comprar = leer.next();
                    } while (comprar.equalsIgnoreCase("si"));
                   }

                    for (Personas aux : personas) {
                        System.out.println(aux);
                    }
                    break;
                case 2:
                    s1.mostrarSala();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
    }

}

