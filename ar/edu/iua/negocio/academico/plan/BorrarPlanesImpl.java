package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class BorrarPlanesImpl {
    public boolean borrar(List<Plan> planes){
        
        if(planes == null) return false;
        //if(plan.isEstadoBorrador() == false) return false; duda

        return true;
    }
}
