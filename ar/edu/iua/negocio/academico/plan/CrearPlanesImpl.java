package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.util.ValidarPlanEx;

public class CrearPlanesImpl implements CrearPlanes{

    public boolean crear(List<Plan> planes) throws CrearPlanEx{
        CrearPlanImpl crearPlan = new CrearPlanImpl();
        if(planes == null) return false;
        try {
            for(int i = 0; i < planes.size(); i++){
                if(crearPlan.crear(planes.get(i)) == false);
            }
        } catch (ValidarPlanEx e) {
           throw new CrearPlanEx(e.getMessage());
        }
        
        return true;
    }
}
