package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class CrearPlanesImpl implements CrearPlanes{
    
    /*public boolean crear(Plan plan){
        CrearPlanImpl verificar = new CrearPlanImpl();
        return verificar.crear(plan);
    }*/

    public boolean crear(List<Plan> planes){
        CrearPlanImpl verificar = new CrearPlanImpl();
        if(planes == null) return false;
        for(int ii = 0; ii < planes.size(); ii++){
            if(verificar.crear(planes.get(ii)) == false) return false;
        }
        return true;
    }
}
