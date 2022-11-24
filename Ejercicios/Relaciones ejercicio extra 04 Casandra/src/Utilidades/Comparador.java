/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import entidades.Alumno;
import java.util.Comparator;

/**
 *
 * @author HJS Informatica
 */
public class Comparador {
 public static Comparator <Alumno> compVotosTUKI= new Comparator<Alumno>() {
     @Override
     public int compare(Alumno t, Alumno t1) {
      return t1.getVotos().compareTo(t.getVotos());  }
     
 };
         
         
         
         
         
}
