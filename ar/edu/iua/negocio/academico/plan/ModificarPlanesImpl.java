package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class ModificarPlanesImpl implements ModificarPlanes{
    public boolean modificar(List<Plan> planes) {
        ModificarPlan modificado = new ModificarPlanImpl();
        if(planes == null) return false;
        for(int ii = 0; ii < BaseDeDatos.planes.size(); ii++){
            for(int kk = 0; kk < BaseDeDatos.planes.size(); kk++){
                if(BaseDeDatos.planes.get(ii).equals(planes.get(kk))){
                    modificado.modificar(planes.get(kk));
                }
            }
        }
        
        return true;
    }
}
