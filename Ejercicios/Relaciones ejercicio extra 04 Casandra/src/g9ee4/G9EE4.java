/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9ee4;

import entidades.Alumno;
import entidades.Voto;
import java.util.ArrayList;
import servicios.Simulador;

/**
 *
 * @author HJS Informatica
 */
public class G9EE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador sv= new Simulador();
        ArrayList<Alumno> almns= sv.crearAlumnos();
        sv.mostrar(almns);
        ArrayList<Voto> votos= sv.votin(almns);
        System.out.println("-------------VOTOS-----------");
        sv.mostrarVotos(votos);
        sv.agregarVotos(almns, votos);
        sv.facilitadores(almns);
                
    }
    
}
