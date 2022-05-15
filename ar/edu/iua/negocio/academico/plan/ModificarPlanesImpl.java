package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class ModificarPlanesImpl implements ModificarPlanes{
    public boolean modificar(List<Plan> planes) {

        ModificarPlan modificarPlan = new ModificarPlanImpl();
        boolean ok = false;

        if(planes == null) return false;

        for(int ii = 0; ii < planes.size(); ii++){
            ok = modificarPlan.modificar(planes.get(ii));
        }
        
        return ok;
    }
}
