package ar.edu.iua.negocio.academico.plan;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.ObjetoEx;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.Transformar;

public class BuscarPlanesImpl implements BuscarPlanes {
    
    public List<Plan> buscar(String terminos) throws ObjetoEx {
        boolean ok = false;
        List<Plan> r = new ArrayList<Plan>();

        try {
            ok = validar(terminos);
            List<Plan> planes = BaseDeDatos.getPlanes();
            if(ok == true){
                String arrayTerminos[] = terminos.split(" ");
                FOR_PLAN:
                for (Plan plan : planes) {
                    String toFullString = Transformar.traducirCadena(plan.fullToString().toLowerCase());
                    for (String termino : arrayTerminos) { 
                        if (toFullString.contains(Transformar.traducirCadena(termino.toLowerCase()))) {
                            r.add(plan);
                            continue FOR_PLAN;
                        }
                    }
                }
                return r;
            }
        } catch (ObjetoEx e) {
            throw new BuscarPlanEx(e.getMessage());
        }catch (CloneNotSupportedException e) {
            throw new BuscarPlanEx(e.getMessage());
        }
        return r;
    }

    private boolean validar(String terminos) throws BuscarPlanEx{
        if(terminos == null) throw new BuscarPlanEx("No esta buscando nada");
        return true;
    }
}
