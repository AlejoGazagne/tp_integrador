package ar.edu.iua;

import javax.swing.JFrame;

import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.Pruebas;

public class Main {

    public static void main(String[] args) {
        System.out.println("Comienzo de main 3333\n\n");
        //JFrame ventana = new JFrame("Programa Monserrat");

        Pruebas pruebas = new Pruebas();
        pruebas.probar();
        System.out.println("Planes guardados: " + BaseDeDatos.planes.size());
        for(int ii = 0; ii < BaseDeDatos.planes.size(); ii++){
            System.out.println("Aniosguardados: " + BaseDeDatos.planes.get(ii).getAnio());    
        }

        System.out.println("\n\nFin de main");
    }

}

/*
Dudas con el modificar plan... no anda. Ahora si modificamos un plan con un dato erroneo borra el anterior. como ahcer para que se quede guardado con el dato anterior
Profe expliquenos como tenemos que hacer el modificar
Que tenemos que hacer en las intefaces
*/