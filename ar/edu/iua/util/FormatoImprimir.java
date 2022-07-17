package ar.edu.iua.util;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.profesores.Profesor;
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

    public static void imprimirProfesores() {
        List<Profesor> base;
        try {
            base = BaseDeDatos.getProfesores();
            for(int i = 0; i < base.size(); i++){
                System.out.print(base.get(i).getDni() + "\t");
                System.out.println(base.get(i).getNombre());
                for(int j = 0; j < base.get(i).getMaterias().size(); j++){
                    System.out.println(base.get(i).getMaterias().get(j));
                }
                System.out.println("----------------------------------------");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
    }

}
