package ar.edu.iua.util;


import java.util.List;

import ar.edu.iua.interfazusuario.BuscarEImprimirPlanes;
import ar.edu.iua.interfazusuario.BuscarEImprimirPlanesImpl;
import ar.edu.iua.modelo.academico.plan.AnioPlan;
import ar.edu.iua.modelo.academico.plan.Materia;
import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.BorrarPlan;
import ar.edu.iua.negocio.academico.plan.BorrarPlanImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlanes;
import ar.edu.iua.negocio.academico.plan.BorrarPlanesImpl;
import ar.edu.iua.negocio.academico.plan.CrearPlanes;
import ar.edu.iua.negocio.academico.plan.CrearPlanesImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlan;
import ar.edu.iua.negocio.academico.plan.ModificarPlanImpl;
import ar.edu.iua.persistencia.BaseDeDatos;


public class Pruebas {

    public void probar() {
        
        List<Plan> planes = GenerarEjemplosDePlanes.generar(10, true);

        System.out.println("Se crearon " + planes.size() + " planes.");


        CrearPlanes crearPlanes = new CrearPlanesImpl();

        boolean ok = crearPlanes.crear(planes);

        if (ok == false) {
            System.out.println("Error");
            return;
        }else{
            System.out.println("Se creo con exito");
        }

        FormatoImprimir.imprimirFormato(BaseDeDatos.planes);

        imprimirBase(BaseDeDatos.planes);

        ModificarPlan modificarPlan = new ModificarPlanImpl();
        
        planes.get(0).getAnios().get(2).setNumero(-2);
        planes.get(1).setEstadoBorrador();

        boolean si = modificarPlan.modificar(planes.get(0));
        System.out.println("\n\nSe modifico el plan " + planes.get(0) + " ? = " + (si ? "SI" : "NO") );

        si = modificarPlan.modificar(planes.get(1));
        System.out.println("Se modifico el plan " + planes.get(1) + " ? = " + (si ? "SI" : "NO") );

        planes.get(2).setAnio(2080);
        si = modificarPlan.modificar(planes.get(2));
        System.out.println("Se modifico el plan " + planes.get(2) + " ? = " + (si ? "SI" : "NO") );

        imprimirBase(BaseDeDatos.planes);

        BuscarEImprimirPlanes buscarImprimir = new BuscarEImprimirPlanesImpl();
        buscarImprimir.buscar("Chi Arg");
        System.out.println("\nAhora buscamos Inglés con tilde");
        buscarImprimir.buscar("Inglés");

        System.out.println("\n\nBorramos un solo plan");
        BorrarPlan borrarPlan = new BorrarPlanImpl();
        borrarPlan.borrar(BaseDeDatos.planes.get(1));
        FormatoImprimir.imprimirFormato(BaseDeDatos.planes);

        System.out.println("\n\nBorramos todos los planes borradores de la base de datos");
        BorrarPlanes borrarBaseDeDatos = new BorrarPlanesImpl();
        borrarBaseDeDatos.borrar(BaseDeDatos.planes);
        FormatoImprimir.imprimirFormato(BaseDeDatos.planes);

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