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
            for(int i = 0; i < planes.size(); i++){
                ok = modificarPlan.modificar(planes.get(i));
            }
        } catch (ValidarPlanEx e) {
            throw new ModificarPlanEx(e.getMessage());
        }
        

        return ok;
    }
}
