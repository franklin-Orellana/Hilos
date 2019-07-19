/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.hilos;

import ec.edu.ups.hilos.Corredor;

public class Principal {

    public static void main(String[] args) {
        Vasos vasos = new Vasos();
        Corredor corredor1 = new Corredor("\njoselo",vasos);
        Corredor corredor2 = new Corredor("\njuan",vasos);
        Corredor corredor3 = new Corredor("\nmaria",vasos);
        System.out.println("Inicia carrera: ");
        
        Thread hilo1 = new Thread(corredor1);
        Thread hilo2 = new Thread(corredor2);
        Thread hilo3 = new Thread(corredor3);
        
        hilo1.setPriority(2);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        System.out.println("Finaliza carrera");
    }
    //sumatoria de dos matrices a+b=c
    //1000*1000
    //sacar tiempo 
    //dividir matris en 4 partes iguales
}
