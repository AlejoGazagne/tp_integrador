package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.PlanImpl;

public interface ModificarPlanes {

    /*
        Este metodo requiere que se recuperen los planes de la base, se modifiquen y luego se guarden nuevamente en la base de datos
        Se debe validar y retornar false si:
            - planes no puede ser null
            - Ver las mismas reglas de ModificarPlan.modificar(Plan plan)
    */
    boolean modificar(List<PlanImpl> planes) throws ModificarPlanEx;    
    
}
