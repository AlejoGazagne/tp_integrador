package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.ValidarPlan;

public class CrearPlanImpl implements CrearPlan {

    public boolean crear(Plan plan) {
       
        boolean ok = ValidarPlan.validacion(plan);
        
        if (ok == true){
            try {
                BaseDeDatos.planes.add((Plan) plan.clone());
                return true;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return false;
            }
        } else return false;
    }
}
