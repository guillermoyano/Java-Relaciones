/*
De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada
*/
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {

    private Integer precio;
    private ArrayList<Personas> people;
    private ArrayList<Peliculas> movies;

    public Cine() {
         this.precio = 750;
    }

    public Cine(Integer precio, ArrayList<Personas> people, ArrayList<Peliculas> movies) {
        this.precio = precio;
        this.people = people;
        this.movies = movies;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public ArrayList<Personas> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Personas> people) {
        this.people = people;
    }

    public ArrayList<Peliculas> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Peliculas> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Cine{" + "precio=" + precio + ", people=" + people + ", movies=" + movies + '}';
    }
    
    
    
}
