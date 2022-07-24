package ar.edu.iua.persistencia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;


public class BaseDeDatos {

    private static List<PlanImpl> planes = new ArrayList<PlanImpl>();
    private static List<ProfesorImpl> profesores = new ArrayList<ProfesorImpl>();

    public BaseDeDatos() {

    }

    public static List<PlanImpl> getPlanes() throws CloneNotSupportedException {
        return new ArrayList<PlanImpl>(planes);
    }

    public static void setPlan(PlanImpl aux) throws CloneNotSupportedException {
        BaseDeDatos.planes.add((PlanImpl)aux.clone());
    }

    public static void modifyPlan(int i, PlanImpl aux) throws CloneNotSupportedException {
        BaseDeDatos.planes.set(i, aux);
    }

    public static void deletePlan(int i) throws CloneNotSupportedException {
        BaseDeDatos.planes.remove(i);
    }
   
    //--------------------------------------------------------------------------------------------------------------------
   
    public static List<ProfesorImpl> getProfesores() throws CloneNotSupportedException {
        return new ArrayList<ProfesorImpl>(profesores);
    }

    public static void setProfesor(ProfesorImpl aux) throws CloneNotSupportedException {
        BaseDeDatos.profesores.add((ProfesorImpl) aux.clone());
    }

    public static void deleteProfesor(int i) throws CloneNotSupportedException {
        BaseDeDatos.profesores.remove(i);
    }

    public static void modifyProfesor(int i, ProfesorImpl aux) throws CloneNotSupportedException {
        BaseDeDatos.profesores.set(i, aux);
    }

}
