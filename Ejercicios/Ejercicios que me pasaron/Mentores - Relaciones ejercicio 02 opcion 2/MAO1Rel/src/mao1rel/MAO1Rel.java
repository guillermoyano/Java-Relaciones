/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mao1rel;

import Entidades.DNI;
import Entidades.Persona;

/**
 *
 * @author German
 */
public class MAO1Rel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DNI dniPersona = new DNI("S", 33107083);
        
        Persona p1 = new Persona();
        
        p1.setNombre("Horacio");
        p1.setApellido("Torrente");
        p1.setDni(dniPersona);
        
        System.out.println(p1.toString());
    }
    
}
