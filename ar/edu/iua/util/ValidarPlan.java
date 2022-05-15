package ar.edu.iua.util;
import ar.edu.iua.modelo.academico.plan.Plan;

public class ValidarPlan {
    
    public static boolean validacion(Plan plan){
        if(plan == null) return false;
        if(plan.isEstadoActivo() == false && plan.isEstadoBorrador() == false && plan.isEstadoNoActivo() == false) return false;
        if(plan.getAnio() == 0 && plan.isEstadoBorrador() == false) return false; 
        if(plan.getAnio() < 1990 || plan.getAnio() > 2040) return false; 
        if(plan.getAnios() == null && plan.isEstadoBorrador() == false) return false;
        for(int ii = 0; ii < plan.getAnios().size(); ii++){
            if(!plan.getAnios().get(ii).getPlan().equals(plan)) return false;
            if(plan.getAnios().get(ii).getNumero() <= 0) return false;
            if(plan.getAnios().get(ii).getNumero() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getNumero() != ii + 1) return false;
            for(int kk = 0; kk < plan.getAnios().size(); kk++){
                if(plan.getAnios().get(kk).getNumero() == plan.getAnios().get(ii).getNumero() && (ii != kk)) return false;
                if(plan.getAnios().get(kk).getMaterias().get(kk).getCodigo() == plan.getAnios().get(ii).getMaterias().get(ii).getCodigo() && (ii != kk)) return false;
                if(!plan.getAnios().get(ii).getMaterias().get(kk).getAnio().equals(plan.getAnios().get(ii)))return false; 
            }
            if(plan.getAnios().get(ii).getNombre() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getMaterias() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCodigo() <= 0) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCodigo() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getNombre() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCargaHoraria() == 0.0 && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCargaHoraria() <= 0) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCargaHoraria() == null && plan.isEstadoBorrador() == false) return false;
        }
        return true;
    }
}
