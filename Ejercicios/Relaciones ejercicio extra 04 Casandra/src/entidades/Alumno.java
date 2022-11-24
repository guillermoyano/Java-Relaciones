/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;

/**
 *Desarrollar un simulador del sistema de votación de facilitadores en Egg-
El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:

nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.

 */
public class Alumno {
    private String nombre;
    private Integer DNI,votos;

   

    public Alumno(String nombre, Integer DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Alumno() {
    }

    public Alumno(String nombre, Integer DNI, Integer votos) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre:" + nombre + ", DNI:" + DNI + ", votos:" + votos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.votos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.votos, other.votos)) {
            return false;
        }
        return true;
    }
    
    
}
