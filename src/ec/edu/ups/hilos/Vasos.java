/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.hilos;

/**
 *
 * @author Fernanda
 */
public class Vasos {
    
    private int vasos;
    
    public Vasos(){
        vasos = 0;
    }
    
    public synchronized void sumar(){
        vasos++;
        System.out.println("Vasos: " + vasos);
    }
}
