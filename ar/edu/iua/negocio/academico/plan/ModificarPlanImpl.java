package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.ValidarPlanCrearModificar;
import ar.edu.iua.util.ValidarPlanEx;

public class ModificarPlanImpl implements ModificarPlan {
    public boolean modificar(Plan plan) throws ModificarPlanEx{
        
        try {
            if (ValidarPlanCrearModificar.validacion(plan)) {
                List<PlanImpl> base = BaseDeDatos.getPlanes();
                
                for (int i = 0; i < base.size(); i++) {
                    if (base.get(i).getAnio().equals(plan.getAnio())) {
                        BaseDeDatos.modifyPlan(i, (PlanImpl) plan.clone());
                        return true;
                    }
                }
            }
        } catch (ValidarPlanEx e) {
            throw new ModificarPlanEx(e.getMessage());

        } catch (CloneNotSupportedException e) {
            throw new ModificarPlanEx(e.getMessage());
        }

        return false;
    }
}
