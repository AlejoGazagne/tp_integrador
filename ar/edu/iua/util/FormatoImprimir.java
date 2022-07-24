package ar.edu.iua.util;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class FormatoImprimir {
    public static void imprimirFormato(){
        int cantMaterias = 0; 
        System.out.println("PLANES" + "\t" + "ANIOS" + "\t" + "MATERIAS" + "   " + "ESTADO");
        System.out.println("------" + "\t" + "-----" + "\t" + "--------" + "   " + "---------");      
        
        try {
            for(Plan plan : BaseDeDatos.getPlanes()){
                cantMaterias = contarMaterias(plan);
                System.out.print(" " + plan.getAnio() + "\t  " + plan.getAnios().size() + "\t   " + cantMaterias + "\t   ");
                if(plan.isEstadoActivo()){
                    System.out.println("ACTIVO");
                } else if(plan.isEstadoBorrador()){
                    System.out.println("BORRADOR");
                } else if(plan.isEstadoNoActivo()){
                    System.out.println("NO ACTIVO"); 
                }
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static int contarMaterias(Plan plan){
        int cantMaterias = 0;
        for(int i = 0; i < plan.getAnios().size(); i++){
            cantMaterias = cantMaterias + plan.getAnios().get(i).getMaterias().size();
        }

        return cantMaterias;
    }

    public static void imprimirFormatoLista(List<PlanImpl> planesEncontrados){
        int cantMaterias = 0; 
        System.out.println("PLANES" + "\t" + "ANIOS" + "\t" + "MATERIAS" + "   " + "ESTADO");
        System.out.println("------" + "\t" + "-----" + "\t" + "--------" + "   " + "---------");      
        
        
            for(Plan plan : planesEncontrados){
                cantMaterias = contarMaterias(plan);
                System.out.print(" " + plan.getAnio() + "\t  " + plan.getAnios().size() + "\t   " + cantMaterias + "\t   ");
                if(plan.isEstadoActivo()){
                    System.out.println("ACTIVO");
                } else if(plan.isEstadoBorrador()){
                    System.out.println("BORRADOR");
                } else if(plan.isEstadoNoActivo()){
                    System.out.println("NO ACTIVO"); 
                }
            }
        
    }

    public static void imprimirProfesores() {
        List<ProfesorImpl> base;
        try {
            base = BaseDeDatos.getProfesores();
            for(int i = 0; i < base.size(); i++){
                System.out.print("DNI: " + base.get(i).getDni() + "\n");
                System.out.println("Nombre: " + base.get(i).getNombre());
                for(int j = 0; j < base.get(i).getMaterias().size(); j++){
                    System.out.println("\t" + base.get(i).getMaterias().get(j));
                }
                System.out.println("----------------------------------------");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
    }

}
