package ejercicios;

import java.awt.*;  
import java.awt.event.*; 
import java.lang.*; 
import java.io.*;

public class HiloTortugaLiebre {
    // Método main
    public static void main(String args[])
    {
        // Declara hilo tortuga
        TortugaThread tortuga1 = new TortugaThread(); 
        TortugaThread tortuga2 = new TortugaThread(); 
        TortugaThread tortuga3 = new TortugaThread(); 
        TortugaThread tortuga4 = new TortugaThread(); 
        TortugaThread tortuga5 = new TortugaThread(); 

        // Declara hilo liebre
        Thread liebre1 = new Thread(new LiebreThread());
        Thread liebre2 = new Thread(new LiebreThread());
        Thread liebre3 = new Thread(new LiebreThread());
        Thread liebre4 = new Thread(new LiebreThread());
        Thread liebre5 = new Thread(new LiebreThread());

        // Lanzamos hilos
        tortuga1.start(); 
        liebre1.start();
        
        tortuga2.start(); 
        liebre2.start();
        
        tortuga3.start(); 
        liebre3.start();
        
        tortuga4.start(); 
        liebre4.start();
        
        tortuga5.start(); 
        liebre5.start();

    }

}
