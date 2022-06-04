package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.util.ValidarPlanEx;

public class ModificarPlanesImpl implements ModificarPlanes{
    public boolean modificar(List<Plan> planes) throws ModificarPlanEx {

        ModificarPlan modificarPlan = new ModificarPlanImpl();
        boolean ok = false;

        if(planes == null) return false;

        try {
            for(int ii = 0; ii < planes.size(); ii++){
                ok = modificarPlan.modificar(planes.get(ii));
            }
        } catch (ValidarPlanEx e) {
            throw new ModificarPlanEx(e.getMessage());
        }
        
        
        return ok;
    }
}
