/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RangoException 
    {
        Alumno pepe = new Alumno();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digame el nombre del Alumno");
        String nombre = teclado.nextLine();
        pepe.setNombre(nombre);
        pepe.pedirNotas();
        
        System.out.println("¿Desea modificar la nota? S/N");
        String opcion = teclado.nextLine();
        
        switch(opcion)
        {
            case "S":
                pepe.modificarNota(0, 0);
                break;
            case "N":
                System.out.println("Has finalizado el programa");
                break;
        }
        
        pepe.imprimirCalificaciones();
        
        
    }
    
}
