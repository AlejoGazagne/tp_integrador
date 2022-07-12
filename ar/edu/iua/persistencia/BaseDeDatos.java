package ar.edu.iua.persistencia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.profesores.Profesor;

public class BaseDeDatos {

    private static List<Plan> planes = new ArrayList<Plan>();
    private static List<Profesor> profesores = new ArrayList<Profesor>();

    public BaseDeDatos() {

    }

    public static List<Plan> getPlanes() throws CloneNotSupportedException {
        return new ArrayList<Plan>(planes);
    }

    public static void setPlan(Plan aux) throws CloneNotSupportedException {
        BaseDeDatos.planes.add((Plan)aux.clone());
    }

    public static void modifyPlan(int ii, Plan aux) throws CloneNotSupportedException {
        BaseDeDatos.planes.set(ii, aux);
    }

    public static void deletePlan(int ii) throws CloneNotSupportedException {
        BaseDeDatos.planes.remove(ii);
    }
    
    //--
    
    public static List<Profesor> getProfesores() throws CloneNotSupportedException {
        return new ArrayList<Profesor>(profesores);
    }

    public static void setProfesores(Profesor aux) throws CloneNotSupportedException {
        BaseDeDatos.profesores.add((Profesor) aux.clone());
    }

    public static void deleteProfesor(int ii) throws CloneNotSupportedException {
        BaseDeDatos.profesores.remove(ii);
    }

    public static void modifyProfesor(int ii, Profesor aux) throws CloneNotSupportedException {
        BaseDeDatos.profesores.set(ii, aux);
    }
}
