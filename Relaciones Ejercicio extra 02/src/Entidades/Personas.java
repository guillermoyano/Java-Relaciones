/*
del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
*/
package Entidades;

public class Personas {

    private String nombre;
    private Integer edad, dinero;

    public Personas() {
    }

    public Personas(String nombre, Integer edad, Integer dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
}
