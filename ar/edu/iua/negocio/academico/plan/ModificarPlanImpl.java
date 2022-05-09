package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class ModificarPlanImpl implements ModificarPlan{
    public boolean modificar(Plan plan){
        CrearPlanImpl modificado = new CrearPlanImpl();
        for(int ii = 0; ii < BaseDeDatos.planes.size(); ii++){
            if(BaseDeDatos.planes.get(ii).equals(plan)){
                /*boolean ok = modificado.crear(plan);
                if(ok == true){
                    BaseDeDatos.planes.remove(ii);
                    return true;
                }else{
                    return false;
                }*/
                BaseDeDatos.planes.remove(ii);
                modificado.crear(plan);
                return true;
            }
        }
        return false;
    }
}
