package ar.edu.iua.util;
import ar.edu.iua.modelo.academico.plan.Plan;

public class ValidarPlanCrearModificar {
    
    public static boolean validacion(Plan plan) throws ValidarPlanEx{
        if(plan == null) throw new ValidarPlanEx("Plan es null");
        if(plan.isEstadoActivo() == false && plan.isEstadoBorrador() == false && plan.isEstadoNoActivo() == false) throw new ValidarPlanEx("No tiene estado");
        if(plan.getAnio() == 0 && plan.isEstadoBorrador() == false) throw new ValidarPlanEx("El anio es = 0 y el estado no es borrador");
        if(plan.getAnio() < 1990 || plan.getAnio() > 2040) throw new ValidarPlanEx("El anio del plan esta mal");
        if(plan.getAnios() == null && plan.isEstadoBorrador() == false) throw new ValidarPlanEx("Anio es null");
        for(int i = 0; i < plan.getAnios().size(); i++){
            //if(!plan.getAnios().get(i).getPlan().equals(plan)) throw new ValidarPlanEx("Ya hay un plan igual");
            if(plan.getAnios().get(i).getNumero() <= 0) throw new ValidarPlanEx("El anio plan es menor a 0");
            if(plan.getAnios().get(i).getNumero() == null && plan.isEstadoBorrador() == false) throw new ValidarPlanEx("El numero del plan es null");
            if(plan.getAnios().get(i).getNumero() != i + 1) throw new ValidarPlanEx("Los anios no son secuenciales");
            for(int k = 0; k < plan.getAnios().size(); k++){
                if(plan.getAnios().get(k).getNumero() == plan.getAnios().get(i).getNumero() && (i != k)) throw new ValidarPlanEx("Ya hay un numero de anio plan igual");
                if(plan.getAnios().get(k).getMaterias().get(k).getCodigo() == plan.getAnios().get(i).getMaterias().get(i).getCodigo() && (i != k)) throw new ValidarPlanEx("El codigo de la materia esta repetido");
                //if(!plan.getAnios().get(i).getMaterias().get(k).getAnio().equals(plan.getAnios().get(i))) throw new ValidarPlanEx("Anio de materia diferente al anio del plan");
            }
            if(plan.getAnios().get(i).getNombre() == null && plan.isEstadoBorrador() == false) throw new ValidarPlanEx("nombre del anio plan null");
            if(plan.getAnios().get(i).getMaterias() == null && plan.isEstadoBorrador() == false) throw new ValidarPlanEx("No hay lista de materias");
            if(plan.getAnios().get(i).getMaterias().get(i).getCodigo() <= 0) throw new ValidarPlanEx("Codigo de materia inapropiado");
            if(plan.getAnios().get(i).getMaterias().get(i).getCodigo() == null && plan.isEstadoBorrador() == false) throw new ValidarPlanEx("Codigo null");
            if(plan.getAnios().get(i).getMaterias().get(i).getNombre() == null && plan.isEstadoBorrador() == false) throw new ValidarPlanEx("nomrbe de materia null");
            if(plan.getAnios().get(i).getMaterias().get(i).getCargaHoraria() == 0.0 && plan.isEstadoBorrador() == false) throw new ValidarPlanEx("Carga horaria 0");
            if(plan.getAnios().get(i).getMaterias().get(i).getCargaHoraria() <= 0) throw new ValidarPlanEx("Carga horaria inapropiada");
            if(plan.getAnios().get(i).getMaterias().get(i).getCargaHoraria() == null && plan.isEstadoBorrador() == false) throw new ValidarPlanEx("Carga horaria null");
        }
        return true;
    }
}
