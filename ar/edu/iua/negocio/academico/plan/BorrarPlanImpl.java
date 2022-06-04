package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BorrarPlanImpl implements BorrarPlan{
    public boolean borrar(Plan plan) throws BorrarPlanEx{

        if(plan != null){
            try {
                for(int ii = 0; ii < BaseDeDatos.getPlanes().size(); ii++){
                    if(BaseDeDatos.getPlanes().get(ii).getAnio().equals(plan.getAnio()) && BaseDeDatos.getPlanes().get(ii).isEstadoBorrador() != false){
                        BaseDeDatos.deletPlan(ii);
                        return true;
                    }
                }
            } catch (CloneNotSupportedException e1) {
                e1.printStackTrace();
            }
            
        }

        return false;
    }
}
