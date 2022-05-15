package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class BorrarPlanesImpl implements BorrarPlanes{
    public boolean borrar(List<Plan> planes){
        
        if(planes == null) return false;
        for(int ii = 0; ii < planes.size(); ii++){
            BorrarPlan borrarPlan = new BorrarPlanImpl();
            borrarPlan.borrar(planes.get(ii));
        }
        return true;
    }
}
