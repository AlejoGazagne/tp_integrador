package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.PlanImpl;

public class BorrarPlanesImpl implements BorrarPlanes{
    public boolean borrar(List<PlanImpl> planes) throws BorrarPlanEx{

        if(planes == null) return false;
        for(int i = 0; i < planes.size(); i++){
            BorrarPlanImpl borrarPlan = new BorrarPlanImpl();
            borrarPlan.borrar(planes.get(i));
        }
        return true;
    }
}
