package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.util.ValidarPlanEx;

public class ModificarPlanesImpl implements ModificarPlanes{
    public boolean modificar(List<PlanImpl> modificadoList) throws ModificarPlanEx {

        ModificarPlan modificarPlan = new ModificarPlanImpl();
        boolean ok = false;

        if(modificadoList == null) return false;

        try {
            for(int i = 0; i < modificadoList.size(); i++){
                ok = modificarPlan.modificar(modificadoList.get(i));
            }
        } catch (ValidarPlanEx e) {
            throw new ModificarPlanEx(e.getMessage());
        }
        

        return ok;
    }
}
