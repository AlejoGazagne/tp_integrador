package ar.edu.iua.negocio.academico.plan;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.Transformar;

public class BuscarPlanesImpl implements BuscarPlanes {
    
    public List<Plan> buscar(String terminos) {
        
        List<Plan> r = new ArrayList<Plan>();
        
        String arrayTerminos[] = terminos.split(" ");
        
        FOR_PLAN:
        for (Plan plan : BaseDeDatos.planes) {
            String toFullString = Transformar.TraducirCadena(plan.fullToString().toLowerCase());
            for (String termino : arrayTerminos) { 
                if (toFullString.contains(Transformar.TraducirCadena(termino.toLowerCase()))) {
                    r.add(plan);
                    continue FOR_PLAN;
                }
            }
        }

        return r;
    }
}
