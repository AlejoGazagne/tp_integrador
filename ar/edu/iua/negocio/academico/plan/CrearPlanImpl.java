package ar.edu.iua.negocio.academico.plan;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.persistencia.BaseDeDatos;

public class CrearPlanImpl implements CrearPlan {

    public boolean crear(Plan plan) {

        if(plan == null) return false;
        if(plan.isEstadoActivo() == false && plan.isEstadoBorrador() == false && plan.isEstadoNoActivo() == false) return false;
        if(plan.getAnio() == 0 && plan.isEstadoBorrador() == false) return false;
        if(!(1990 < plan.getAnio() && plan.getAnio() < 2040)) return false; 
        if(plan.getAnios() == null && plan.isEstadoBorrador() == false) return false;
        // 1 FALTA UNO (No se permite un año con el att plan != del plan que se recibe [ej. plan.getAnios().get(0).getPlan().equals(plan) == false, es error ])
        for(int ii = 0; ii < plan.getAnios().size(); ii++){
            if(!plan.getAnios().get(ii).getPlan().equals(plan)) return false;// (1)
            if(plan.getAnios().get(ii).getNumero() <= 0) return false;
            if(plan.getAnios().get(ii).getNumero() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getNumero() != ii + 1) return false;
            for(int kk = 0; kk < plan.getAnios().size(); kk++){
                if(plan.getAnios().get(kk).getNumero() == plan.getAnios().get(ii).getNumero() && (ii != kk)) return false;
                if(plan.getAnios().get(kk).getMaterias().get(kk).getCodigo() == plan.getAnios().get(ii).getMaterias().get(ii).getCodigo() && (ii != kk)) return false;
                // 2 FALTA UNO (No se permite una materia con el att anioPlan != del anioPlan al q pertenece [ej. anioPlan.getMaterias().get(0).getAnioPlan().equals(anioPlan) == false, es error ])
                if(!plan.getAnios().get(ii).getMaterias().get(kk).getAnio().equals(plan.getAnios().get(ii)))return false; // (2)
            }
            if(plan.getAnios().get(ii).getNombre() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getMaterias() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCodigo() <= 0) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCodigo() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getNombre() == null && plan.isEstadoBorrador() == false) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCargaHoraria() == 0.0 && plan.isEstadoBorrador() == false) return false; // duda tiene que ser null o 0.0
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCargaHoraria() <= 0) return false;
            if(plan.getAnios().get(ii).getMaterias().get(ii).getCargaHoraria() == null && plan.isEstadoBorrador() == false) return false;
        }
        // FALTA UNO (Los numeros de las materias en el listado de materias de un año debe ser secuancial, comenzando en 1)
        
        BaseDeDatos.planes.add(plan);
        return true;
    }
}
