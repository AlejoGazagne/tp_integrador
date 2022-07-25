package ar.edu.iua;

import ar.edu.iua.modelo.ObjetoEx;
import ar.edu.iua.util.Pruebas;


public class Main {
    public static void main(String[] args) {
        System.out.println("Comienzo de main\n\n");

        Pruebas pruebas = new Pruebas();
     
        try {
            pruebas.probar();
        } catch (ObjetoEx e) {
            System.err.println(e);
        }
        
      
        System.out.println("\n\nFin de main"); 
    }
}
