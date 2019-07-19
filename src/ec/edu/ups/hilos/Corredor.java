/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.hilos;
import ec.edu.ups.hilos.Vasos;
import java.util.Random;

/**
 *
 * @author Fernanda
 */
public class Corredor implements Runnable {

    private String nombre;
    private int velocidad;

    private Vasos vasos;

    public Corredor(String nombre, Vasos vasos) {
        this.nombre = nombre;
        Random r = new Random();
        this.velocidad = 1000;
        this.vasos = vasos;
        
    }
    
    public synchronized void sumar(){

        System.out.println("Vasos: " + vasos);
    }

    @Override
    public void run() {
        try {
            System.out.println("Inicia la carrera" + this.nombre);
            long inicio = System.currentTimeMillis();
            Thread.sleep(velocidad);
            this.vasos.sumar();
            long fin = System.currentTimeMillis();
            System.out.println("Tiempo de llegada" + this.nombre + " es " + (fin - inicio));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
    

}
