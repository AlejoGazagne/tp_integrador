package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class BorrarPlanesImpl implements BorrarPlanes{
    public boolean borrar(List<Plan> planes){
        BorrarPlan borrarPlan = new BorrarPlanImpl();
        
        if(planes == null) return false;
        for(int ii = 0; ii < planes.size(); ii++){
            if(borrarPlan.borrar(planes.get(ii)) == false) return false;
        }

        return true;
    }
}
