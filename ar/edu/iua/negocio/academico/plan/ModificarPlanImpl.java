package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.ValidarPlan;

public class ModificarPlanImpl implements ModificarPlan {
    public boolean modificar(Plan plan) throws ModificarPlanEx{
        
        try {
            if (ValidarPlan.validacion(plan)) {
                List<PlanImpl> base = BaseDeDatos.getPlanes();
                
                for (int i = 0; i < base.size(); i++) {
                    if (base.get(i).getAnio().equals(plan.getAnio())) {
                        BaseDeDatos.modifyPlan(i, (PlanImpl) plan.clone());
                        return true;
                    }
                }
            }
        } catch (CloneNotSupportedException e) {
            throw new ModificarPlanEx(e.getMessage());
        }

        return false;
    }
}
