package ar.edu.iua;

//import java.io.OutputStream;
//import java.util.ArrayList;
//import java.util.List;

//import com.google.gson.Gson;

import ar.edu.iua.modelo.ObjetoEx;
//import ar.edu.iua.modelo.academico.plan.AnioPlan;
//import ar.edu.iua.modelo.academico.plan.AnioPlanImpl;
//import ar.edu.iua.modelo.academico.plan.Materia;
//import ar.edu.iua.modelo.academico.plan.MateriaImpl;
//import ar.edu.iua.modelo.academico.plan.Plan;
//import ar.edu.iua.modelo.academico.plan.PlanImpl;
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
