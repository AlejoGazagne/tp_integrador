package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;

public class BorrarPlanImpl implements BorrarPlan{
    public boolean borrar(Plan plan){
        
        if(plan == null) return false;
        if(plan.isEstadoBorrador() == false) return false;

        return true;
    }
}
