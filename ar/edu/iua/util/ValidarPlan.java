package ar.edu.iua.util;
import ar.edu.iua.modelo.academico.plan.Plan;

public class ValidarPlan {
    
    public static boolean validacion(Plan plan){
        if(plan == null) return false;
        if(plan.isEstadoActivo() == false && plan.isEstadoBorrador() == false && plan.isEstadoNoActivo() == false) return false;
        if(plan.getAnio() == 0 && plan.isEstadoBorrador() == false) return false; 
        if(plan.getAnio() < 1990 || plan.getAnio() > 2040) return false; 
        if(plan.getAnios() == null && plan.isEstadoBorrador() == false) return false;
        for(int i = 0; i < plan.getAnios().size(); i++){
            //if(!plan.getAnios().get(i).getPlan().equals(plan)) return false;
            if(plan.getAnios().get(i).getNumero() <= 0) return false;
            if(plan.getAnios().get(i).getNumero() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(i).getNumero() != i + 1) return false;
            for(int k = 0; k < plan.getAnios().size(); k++){
                if(plan.getAnios().get(k).getNumero() == plan.getAnios().get(i).getNumero() && (i != k)) return false;
                if(plan.getAnios().get(k).getMaterias().get(k).getCodigo() == plan.getAnios().get(i).getMaterias().get(i).getCodigo() && (i != k)) return false;
                //if(!plan.getAnios().get(i).getMaterias().get(k).getAnio().equals(plan.getAnios().get(i)))return false; 
            }
            if(plan.getAnios().get(i).getNombre() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(i).getMaterias() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(i).getMaterias().get(i).getCodigo() <= 0) return false;
            if(plan.getAnios().get(i).getMaterias().get(i).getCodigo() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(i).getMaterias().get(i).getNombre() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(i).getMaterias().get(i).getCargaHoraria() == 0.0 && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(i).getMaterias().get(i).getCargaHoraria() <= 0) return false;
            if(plan.getAnios().get(i).getMaterias().get(i).getCargaHoraria() == null && plan.isEstadoBorrador() == false) return false;
        }
        return true;
    }
}
