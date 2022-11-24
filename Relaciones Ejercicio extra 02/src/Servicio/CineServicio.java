/*
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
package Servicio;

import Entidades.Cine;
import Entidades.Peliculas;
import Entidades.Personas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CineServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String[][] Sala = new String[8][6];
    Personas p;
    Cine c = new Cine();
    Peliculas ps = new Peliculas();
    int contador=0, conturchi=0, asientosVacios=0;

    public void abrirSala() {
        int random = 0;
        
        for (int i = 7; i > -1; i--) {
            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    Sala[i][j] = (i + 1) + " A ";
                }
                if (j == 1) {
                    Sala[i][j] = (i + 1) + " B ";
                }
                if (j == 2) {
                    Sala[i][j] = (i + 1) + " C ";
                }
                if (j == 3) {
                    Sala[i][j] = (i + 1) + " D ";
                }
                if (j == 4) {
                    Sala[i][j] = (i + 1) + " E ";
                }
                if (j == 5) {
                    Sala[i][j] = (i + 1) + " F ";
                }
                if ((int) (Math.random() * 2) == 0) {
                    Sala[i][j] = Sala[i][j] + "X";
                    contador++;
                } else {
                    Sala[i][j] = Sala[i][j] + " ";
                }
            }
        }
    }
    
    public Personas crearPersona(LinkedList Espectador) {
        p = new Personas();

        p.setNombre("Persona " + (Espectador.size() + 1));
        
        p.setDinero((int) (Math.random() * 2000));
        if (p.getDinero()>= c.getPrecio()){
            System.out.println("La puta madre");
        }else{
            System.out.println("Anda a pedir limosna a otro lado");
            conturchi++;
        }
        p.setEdad((int) (Math.random() * 65));
        if (p.getEdad()>= ps.getEdadMinima()){
            System.out.println("La puta madre");
        }else{
            System.out.println("Anda a dormir pendejín");
            conturchi++;
        }
            return p;
        }
        
    
    
    public void mostrarSala(){
         for (int i = 7; i > -1; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(Sala[i][j] + " | ");
            }
            System.out.println("");
        }
          asientosVacios = 48 - contador;
         
         System.out.println("");
         System.out.println("La cantidad de asientos libres que hay en la sala son: " +asientosVacios);
         System.out.println("");
    }
    
    public int sallallena(){
        asientosVacios = 48 - contador;
         
         return asientosVacios;
    }
    
     public void modificarSala() {
        System.out.println("Ingrese fila: ");
        int fila = leer.nextInt();
        System.out.println("Ingrese columna: ");
        String columna = leer.next();
        if (columna.equalsIgnoreCase("A")) {
            if (Sala[fila-1][0].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
            }else{
                Sala[fila-1][0] += "X| "; 
                contador++;
            }
        }
        if (columna.equalsIgnoreCase("B")) {
             if (Sala[fila-1][1].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
            }else{
                Sala[fila-1][1] += "X| "; 
                contador++;
            }
        }
        if (columna.equalsIgnoreCase("C")) {
             if (Sala[fila-1][2].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
            }else{
                Sala[fila-1][2] += "X| "; 
                contador++;
            }
        }
        if (columna.equalsIgnoreCase("D")) {
             if (Sala[fila-1][3].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
            }else{
                Sala[fila-1][3] += "X| "; 
                contador++;
            }
        }
        if (columna.equalsIgnoreCase("E")) {
             if (Sala[fila-1][4].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
            }else{
                Sala[fila-1][4] += "X| "; 
                contador++;
            }
        }
        if (columna.equalsIgnoreCase("F")) {
             if (Sala[fila-1][5].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
            }else{
                Sala[fila-1][5] += "X| "; 
                contador++;
            }
        }
    }
     
     public boolean corroborar(){
         boolean verifica= false;
         if (conturchi!=0){
             verifica = true;
         }
         return verifica;
     }
}

