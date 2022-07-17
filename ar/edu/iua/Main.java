package ar.edu.iua;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import ar.edu.iua.modelo.ObjetoEx;
import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.AnioPlanImpl;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.MateriaImpl;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.util.Pruebas;


public class Main {
    public static void main(String[] args) {
        System.out.println("Comienzo de main\n\n");


        Pruebas pruebas = new Pruebas(); 
        Gson gson = new Gson();
        
        //------------------------------------------------
        /*List<Materia> materiasList = new ArrayList<Materia>();   
        Materia materia1 = new MateriaImpl();
        Materia materia2 = new MateriaImpl();
        materia1.setCargaHoraria(4.0);
        materia1.setCodigo(0);
        materia1.setNombre("asd");
        materiasList.add(materia1);
        
        materia2.setCargaHoraria(3.0);
        materia2.setCodigo(1);
        materia2.setNombre("WHATSAPP 2");
        materiasList.add(materia2);
        //System.out.println( gson.toJson(materiasList));
        //---------------------
        AnioPlan anioPlan2 = new AnioPlanImpl();
        AnioPlan anioPlan1 = new AnioPlanImpl();
        anioPlan1.setNumero(1);
        anioPlan1.setNombre("Primero");
        
        

        anioPlan2.setNombre("Segundo");
        anioPlan2.setNumero(2);
       

        List<AnioPlan> anioPlanList = new ArrayList<AnioPlan>();
        anioPlanList.add(anioPlan1);
        anioPlanList.add(anioPlan2);
        
      
        Plan plan = new PlanImpl();
        plan.setAnio(2018);
        plan.setEstadoActivo();
       
        anioPlan1.setPlan(plan);
        anioPlan2.setPlan(plan);

        anioPlan2.setMaterias(materiasList);
        anioPlan1.setMaterias(materiasList);
        //anioPlan2.setPlan(plan);
        plan.setAnios(anioPlanList);
        //System.out.println(gson.toJson(anioPlan1));
       
        //------------------------------------------
        //plangeson.setAnios();
        */
     
        try {
            pruebas.probar();    
        } catch (ObjetoEx e) {
            System.err.println(e); 
        }
        
      
        System.out.println("\n\nFin de main"); 
        }
    }
