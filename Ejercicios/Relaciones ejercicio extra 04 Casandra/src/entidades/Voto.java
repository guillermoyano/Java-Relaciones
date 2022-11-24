/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 *  Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos, un objeto
 * Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
public class Voto {
    private Alumno prsn;
    private ArrayList<Alumno> almV;

    public Voto() {
    }

    public Voto(Alumno prsn, ArrayList<Alumno> almV) {
        this.prsn = prsn;
        this.almV = almV;
    }

    public Alumno getPrsn() {
        return prsn;
    }

    public void setPrsn(Alumno prsn) {
        this.prsn = prsn;
    }

    public ArrayList<Alumno> getAlmV() {
        return almV;
    }

    public void setAlmV(ArrayList<Alumno> almV) {
        this.almV = almV;
    }

    @Override
    public String toString() {
        return "Voto{" + "Alumno:" + prsn + ", Alumnos votados:" + almV + '}';
    }
    
    
}
