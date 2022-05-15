package ar.edu.iua.negocio.academico.plan;
import ar.edu.iua.modelo.academico.plan.*;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BuscarPlanImpl implements BuscarPlan {
    
    public Plan buscar(int anio){
        
        for(int ii = 0; ii < BaseDeDatos.planes.size(); ii++){
            if(BaseDeDatos.planes.get(ii).getAnio().equals(anio)) return BaseDeDatos.planes.get(ii);
        } 
        
        return null;
    }
}
