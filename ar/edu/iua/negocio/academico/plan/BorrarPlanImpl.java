package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BorrarPlanImpl implements BorrarPlan{
    public boolean borrar(Plan plan) throws BorrarPlanEx{

        if(plan != null){
            try {
                List<Plan> planes = BaseDeDatos.getPlanes();
                for(int ii = 0; ii < planes.size(); ii++){
                    if(planes.get(ii).getAnio().equals(plan.getAnio()) && planes.get(ii).isEstadoBorrador() != false){
                        BaseDeDatos.deletePlan(ii);
                        return true;
                    }
                }
            } catch (CloneNotSupportedException e1) {
                throw new BorrarPlanEx(e1.getMessage());
            }
            
        }
        return false;
    }
}
