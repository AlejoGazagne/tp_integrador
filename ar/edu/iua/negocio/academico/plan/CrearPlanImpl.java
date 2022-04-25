package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;

public class CrearPlanImpl implements CrearPlan {

    public boolean crear(Plan plan) {

        if(plan == null) return false;
        if(plan.isEstadoActivo() == false && plan.isEstadoBorrador() == false && plan.isEstadoNoActivo() == false) return false;
        if(plan.getAnio() == 0 && plan.isEstadoBorrador() == false) return false;
        if(plan.getAnio() < 1990 || plan.getAnio() > 2040) return false; 
        for(int ii = 0; ii < plan.getAnios().size(); ii++){
            if(plan.getAnios().get(ii).getPlan().getAnio() == 0 && plan.isEstadoBorrador() == false) return false; // Duda
        }


        

        return false;
    }

}
