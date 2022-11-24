package Entidades;

import Numeradores.Tamanio;

public class Perro {

    /**
     * nombre, raza, edad y tamaño;
     */
    private String nombre, raza;
    private Integer edad;
    private Tamanio tamanio;

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", tamanio: " + tamanio + '}';
    }

}
