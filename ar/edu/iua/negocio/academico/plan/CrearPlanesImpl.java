package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class CrearPlanesImpl implements CrearPlanes{

    public boolean crear(List<Plan> planes){
        CrearPlanImpl crearPlan = new CrearPlanImpl();
        if(planes == null) return false;
        for(int ii = 0; ii < planes.size(); ii++){
            if(crearPlan.crear(planes.get(ii)) == false);
        }
        return true;
    }
}
