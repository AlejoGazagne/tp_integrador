package ar.edu.iua.negocio.academico.plan;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.ValidarPlanCrearModificar;
import ar.edu.iua.util.ValidarPlanEx;

public class CrearPlanImpl implements CrearPlan {

    public boolean crear(Plan plan) throws CrearPlanEx{
        boolean ok = false;
        
        try {
            ok = ValidarPlanCrearModificar.validacion(plan);
            if (ok == true){
                BaseDeDatos.setPlan((PlanImpl) plan);
                return true;
                 
            } else return false;
            
        } catch (ValidarPlanEx e) {
            throw new CrearPlanEx(e.getMessage());
        }catch (CloneNotSupportedException e) {
            throw new CrearPlanEx(e.getMessage());
        }
    }

}
