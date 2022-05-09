package ar.edu.iua.util;

import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlan;
import ar.edu.iua.negocio.academico.plan.BorrarPlanImpl;
import ar.edu.iua.negocio.academico.plan.CrearPlanes;
import ar.edu.iua.negocio.academico.plan.CrearPlanesImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlan;
import ar.edu.iua.negocio.academico.plan.ModificarPlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class Pruebas {

    public void probar() {
        
        List<Plan> planes = GenerarEjemplosDePlanes.generar(2, true);

        System.out.println("\n\nSe crearon " + planes.size() + " planes.");


        CrearPlanes crearPlanes = new CrearPlanesImpl();

        boolean ok = crearPlanes.crear(planes);

        if (ok == false) {
            System.out.println("Error");
            return;
        }else{
            System.out.println("Se creo con exito");
        }
        
        ModificarPlan modificarPlan = new ModificarPlanImpl();
        
        planes.get(0).setAnio(2050);
        planes.get(1).setAnio(2003);

        boolean si = modificarPlan.modificar(planes.get(0));
        System.out.println("Se modifico el plan " + planes.get(0) + " ? = " + (si ? "SI" : "NO") );

        si = modificarPlan.modificar(planes.get(1));
        System.out.println("Se modifico el plan " + planes.get(1) + " ? = " + (si ? "SI" : "NO") );

        //GenerarEjemplosDePlanes.imprimirPlanes(planes);
        
        /*
        BuscarEImprimirPlanes buscarEImprimirPlanes = new BuscarEImprimirPlanesImpl();

        // debe buscar todos los planes que contengan en sus datos (incluido años y materias)
        // devolver todos los planes q contengan un valor 18, o mate o hist o 5
        buscarEImprimirPlanes.buscar(" 18 mate hist 5"); 
        

        
        //por favor complete con mas codigo de pruebas, trate de probar todas las clases de negocio, borrar, modificar, buscar    
        */
    }

}
