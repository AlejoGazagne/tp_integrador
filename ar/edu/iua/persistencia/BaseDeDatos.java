package ar.edu.iua.persistencia;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;

public class BaseDeDatos {

    private static List<Plan> planes = new ArrayList<Plan>();

    public BaseDeDatos() {

    }

    public static List<Plan> getPlanes() throws CloneNotSupportedException {
        return planes;
    }

    public static void setPlan(int ii, Plan aux) throws CloneNotSupportedException {
        BaseDeDatos.planes.add(ii, aux);
    }

    public static void modifyPlan(int ii, Plan aux) throws CloneNotSupportedException {
        BaseDeDatos.planes.set(ii, aux);
    }

    public static void deletPlan(int ii) throws CloneNotSupportedException {
        BaseDeDatos.planes.remove(ii);
    }
    
}
