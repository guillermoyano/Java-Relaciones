/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición 
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del 
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
package Entidades;

public class Revolver {

    private Integer tambor[] = new Integer [9];
    private Integer agua, disparo;

    public Revolver() {
    }

    public Revolver(Integer agua, Integer disparo) {
        this.agua = agua;
        this.disparo = disparo;
    }

    public Integer[] getTambor() {
        return tambor;
    }

    public void setTambor(Integer[] tambor) {
        this.tambor = tambor;
    }

    public Integer getAgua() {
        return agua;
    }

    public void setAgua(Integer agua) {
        this.agua = agua;
    }

    public Integer getDisparo() {
        return disparo;
    }

    public void setDisparo(Integer disparo) {
        this.disparo = disparo;
    }

    @Override
    public String toString() {
        return "Revolver{" +  ", agua=" + agua + ", disparo=" + disparo + '}';
    }
    
    

   
    
    
    
}
