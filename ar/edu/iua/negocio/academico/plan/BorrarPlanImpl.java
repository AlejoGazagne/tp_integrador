package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BorrarPlanImpl implements BorrarPlan{
    public boolean borrar(Plan plan){
        
        if(plan == null) return false;
        if(plan.isEstadoBorrador() == false) return false;
        
        BaseDeDatos.planes.remove(plan);
        return true;
    }
}
