/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Alumno 
{
    private final static int num_asignatura = 5;
    private String nombre;
    private ArrayList<Double> notas = new ArrayList<>();

    public Alumno() 
    {
        nombre = "";
    }
    
    public Alumno(String nnombre)
    {
        nombre = nnombre;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() 
    {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) 
    {
        this.notas = notas;
    }
    
    public void pedirNotas() throws RangoException
    {
        Scanner teclado = new Scanner (System.in);
        double notita;
        boolean parar = false;
        for (int i = 0; i < num_asignatura && parar == false; i++) 
        {
            System.out.println("Digame sus notas");
            notita = teclado.nextDouble();
            if (notita >= 0 && notita <= 10)
            {
                notas.add(notita);
            }
            else
            {
                parar = true;
                throw new RangoException("Error. Nota no valida");
            }
        }
    }
    
    public void modificarNota(int posicion, double nnota) throws RangoException, ArrayIndexOutOfBoundsException
    {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        boolean parar = false;
        for (int i = 0; i < num_asignatura && parar == false; i++) 
        {
            System.out.println("Digame la posición");
            posicion = teclado2.nextInt();
            System.out.println("Digame la nota");
            nnota = teclado.nextDouble();
            if (nnota >= 0 && nnota <= 10)
            {
                notas.set(posicion,nnota);
            }
            else
            {
                parar = true;
                throw new RangoException("Error. Nota no valida");
            }
        }
    }
    public void imprimirCalificaciones()
    {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Notas: " + getNotas());
    }
    }

    
    
    


