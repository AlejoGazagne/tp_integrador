package ar.edu.iua.util;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
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
        for(int ii = 0; ii < plan.getAnios().size(); ii++){
            cantMaterias = cantMaterias + plan.getAnios().get(ii).getMaterias().size();
        }

        return cantMaterias;
    }

    public static void imprimirFormatoLista(List<Plan> planes){
        int cantMaterias = 0; 
        System.out.println("PLANES" + "\t" + "ANIOS" + "\t" + "MATERIAS" + "   " + "ESTADO");
        System.out.println("------" + "\t" + "-----" + "\t" + "--------" + "   " + "---------");      
        
        
            for(Plan plan : planes){
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

}
