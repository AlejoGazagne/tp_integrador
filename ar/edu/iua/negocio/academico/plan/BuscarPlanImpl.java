package ar.edu.iua.negocio.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.ObjetoEx;
import ar.edu.iua.modelo.academico.plan.*;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BuscarPlanImpl implements BuscarPlan{
    
    public Plan buscar(int anio) throws BuscarPlanEx{
        
        boolean ok = false;
        try {
            ok = validacion(anio);
            if(ok==true){

                List<Plan> planes = BaseDeDatos.getPlanes();

                for(int i = 0; i < planes.size(); i++){
                    if(planes.get(i).getAnio().equals(anio)) return planes.get(i);
                }
            }
        } catch (ObjetoEx e) {
            throw new BuscarPlanEx(e.getMessage());
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } 
        return null;
    }

    private boolean validacion(int anio) throws ObjetoEx{
        if(anio < 1990 || anio > 2040) throw new ObjetoEx("Busca bien porfavor"); 
        return true;
    }
}
