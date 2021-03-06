package ar.edu.iua.negocio.academico.plan;

import java.util.ArrayList;
import java.util.List;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.Transformar;

public class BuscarPlanesImpl implements BuscarPlanes {
    
    public List<PlanImpl> buscar(String terminos) throws BuscarPlanEx {
        boolean ok = false;
        List<PlanImpl> r = new ArrayList<PlanImpl>();

        try {
            ok = validar(terminos);
            List<PlanImpl> planes = BaseDeDatos.getPlanes();
            if(ok == true){
                String arrayTerminos[] = terminos.split(" ");
                FOR_PLAN:
                for (PlanImpl plan : planes) {
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
        } catch (BuscarPlanEx e) {
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
