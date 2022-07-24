package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.util.ValidarPlanEx;

public class CrearPlanesImpl implements CrearPlanes{

    public boolean crear(List<PlanImpl> creadoList) throws CrearPlanEx{
        CrearPlanImpl crearPlan = new CrearPlanImpl();
        if(creadoList == null) return false;
        try {
            for(int i = 0; i < creadoList.size(); i++){
                if(crearPlan.crear(creadoList.get(i)) == false);
            }
        } catch (ValidarPlanEx e) {
           throw new CrearPlanEx(e.getMessage());
        }
        
        return true;
    }
}
