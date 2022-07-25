package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BorrarPlanImpl implements BorrarPlan{

    public boolean borrar(Plan plan) throws BorrarPlanEx{
        boolean ok = false;
        if(!plan.equals(null)){
            try {
                List<PlanImpl> planes = BaseDeDatos.getPlanes();
                for(int i = 0; i < planes.size(); i++){
                    if(planes.get(i).getAnio().equals(plan.getAnio()) && planes.get(i).isEstadoBorrador() != false){
                        BaseDeDatos.deletePlan(i);
                        ok = true;
                        return ok;
                     }

                }
                if(ok == false){
                    throw new BorrarPlanEx("Operacion invalida.");
                }

            } catch (CloneNotSupportedException e1) {
                throw new BorrarPlanEx(e1.getMessage());
            }
            
        }
        return false;
    }
}
