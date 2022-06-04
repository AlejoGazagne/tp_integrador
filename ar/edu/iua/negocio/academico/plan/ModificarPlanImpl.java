package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.ValidarPlanCrearModificar;
import ar.edu.iua.util.ValidarPlanEx;

public class ModificarPlanImpl implements ModificarPlan {
    public boolean modificar(Plan plan) throws ModificarPlanEx{

        try {
            if (ValidarPlanCrearModificar.validacion(plan)) {
                
                for (int ii = 0; ii < BaseDeDatos.getPlanes().size(); ii++) {
                    if (BaseDeDatos.getPlanes().get(ii).getAnio().equals(plan.getAnio())) {
                        BaseDeDatos.modifyPlan(ii, (Plan) plan.clone());
                        return true;
                    }
                }
            }
        } catch (ValidarPlanEx e) {
            throw new ModificarPlanEx(e.getMessage());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
