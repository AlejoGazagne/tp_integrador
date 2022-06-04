package ar.edu.iua.util;


import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.interfazusuario.BuscarEImprimirPlanes;
import ar.edu.iua.interfazusuario.BuscarEImprimirPlanesImpl;
import ar.edu.iua.modelo.ObjetoEx;
import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlan;
import ar.edu.iua.negocio.academico.plan.BorrarPlanImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlanes;
import ar.edu.iua.negocio.academico.plan.BorrarPlanesImpl;
import ar.edu.iua.negocio.academico.plan.CrearPlan;
import ar.edu.iua.negocio.academico.plan.CrearPlanEx;
import ar.edu.iua.negocio.academico.plan.CrearPlanImpl;
import ar.edu.iua.negocio.academico.plan.CrearPlanes;
import ar.edu.iua.negocio.academico.plan.CrearPlanesImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlan;
import ar.edu.iua.negocio.academico.plan.ModificarPlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;


public class Pruebas {

    public void probar() throws ObjetoEx{
        
        List<Plan> planes = GenerarEjemplosDePlanes.generar(2, true);

        System.out.println("Se crearon " + planes.size() + " planes.");

        CrearPlanes crearPlanes = new CrearPlanesImpl();

        boolean ok = crearPlanes.crear(planes);

        if (ok == false) {
            System.out.println("Error");
            return;
        }else{
            System.out.println("Se creo con exito");
        }

        FormatoImprimir.imprimirFormato();

        // Estas funciones las dejamos asi porque son solamente para imprimir por consola el plan y sus materias
        try {
            imprimirBase(BaseDeDatos.getPlanes());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        ModificarPlan modificarPlan = new ModificarPlanImpl();

        /*CrearPlan p = new CrearPlanImpl();

        Plan romper = new PlanImpl();
        romper.setAnio(0);
        romper.setEstadoActivo();
        
        p.crear(romper);*/

        boolean si = false;
        
        /*planes.get(0).getAnios().get(2).setNumero(-2);

        si = modificarPlan.modificar(planes.get(0));
        System.out.println("\n\nSe modifico el plan " + planes.get(0) + " ? = " + (si ? "SI" : "NO") );*/

        planes.get(1).setEstadoBorrador();
        si = modificarPlan.modificar(planes.get(1));
        System.out.println("Se modifico el plan " + planes.get(1) + " ? = " + (si ? "SI" : "NO") );

        /*planes.get(2).setAnio(2080);
        si = modificarPlan.modificar(planes.get(2));
        System.out.println("Se modifico el plan " + planes.get(2) + " ? = " + (si ? "SI" : "NO") );*/

        try {
            imprimirBase(BaseDeDatos.getPlanes());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        BuscarEImprimirPlanes buscarImprimir = new BuscarEImprimirPlanesImpl();
        buscarImprimir.buscar("Chi Arg");
        System.out.println("\nAhora buscamos Inglés con tilde");
        buscarImprimir.buscar("Inglés");

        System.out.println("\n\nBorramos un solo plan");
        BorrarPlan borrarPlan = new BorrarPlanImpl();
        Plan p = new PlanImpl();
        p.setAnio(2001);
        //borrarPlan.borrar(p);
         
        FormatoImprimir.imprimirFormato();

        List<Plan> listaBorrar = new ArrayList<Plan>();
        listaBorrar.add(p);
        System.out.println("\n\nBorramos todos los planes borradores de la base de datos");
        BorrarPlanes borrarBaseDeDatos = new BorrarPlanesImpl();
        borrarBaseDeDatos.borrar(listaBorrar);
        
        FormatoImprimir.imprimirFormato();
        
    } 

    public static void imprimirBase(List<Plan> planes) {
        for (Plan plan : planes) {
            System.out.println("\n" + plan + " (Estado [borrador, activo, inactivo]): "+ plan.isEstadoBorrador()+
            ", "+plan.isEstadoActivo()+", "+plan.isEstadoNoActivo());
            for (AnioPlan anio : plan.getAnios()) {
                System.out.println("\t" + anio);
                for (Materia materia : anio.getMaterias()) {
                    System.out.println("\t\t" + String.format("%1$" + 2 + "s", materia.getCodigo()) + " - " + materia);
                }
                if (anio.getMaterias().size() == 0) {
                    System.out.println("\t\tA este año no se le cargaron materias!!");
                }
            }
            if (plan.getAnios().size() == 0) {
                System.out.println("\tA este plan no se le cargaron años!!");
            }
        }
    }
}