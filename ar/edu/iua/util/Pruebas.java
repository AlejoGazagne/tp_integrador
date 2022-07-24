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
import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlan;
import ar.edu.iua.negocio.academico.plan.BorrarPlanImpl;
import ar.edu.iua.negocio.academico.plan.BorrarPlanes;
import ar.edu.iua.negocio.academico.plan.BorrarPlanesImpl;
import ar.edu.iua.negocio.academico.plan.CrearPlan;
import ar.edu.iua.negocio.academico.plan.CrearPlanImpl;
import ar.edu.iua.negocio.academico.plan.CrearPlanes;
import ar.edu.iua.negocio.academico.plan.CrearPlanesImpl;
import ar.edu.iua.negocio.academico.plan.ModificarPlan;
import ar.edu.iua.negocio.academico.plan.ModificarPlanImpl;
import ar.edu.iua.negocio.academico.profesor.CrearProfesoresImpl;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.webServices.Server;


public class Pruebas {

    public void probar() throws ObjetoEx {
        
        List<PlanImpl> planes = GenerarEjemplosDePlanes.generar(8, true);

        System.out.println("Se crearon " + planes.size() + " planes.");

        CrearPlanes crearPlanes = new CrearPlanesImpl();

        boolean ok = crearPlanes.crear(planes);

        if (ok == false) {
            System.out.println("Error");
            return;
        }else{
            System.out.println("Se creo con exito la lista de Planes");
        }

        List<ProfesorImpl> profesores = new ArrayList<ProfesorImpl>();
        profesores = GenerarEjemplosDeProfesores.generarYAgregarProfesoresAleatoriamente();

        CrearProfesoresImpl crearProfesores = new CrearProfesoresImpl();
        boolean yes = crearProfesores.crear(profesores);

        if (yes == false) {
            System.out.println("Error");
            return;
        }else{
            System.out.println("Se creo con exito la lista de profes");
        }
    
        //FormatoImprimir.imprimirProfesores();

        FormatoImprimir.imprimirFormatoLista(planes);

        
        //FormatoImprimir.imprimirFormato();
        // Estas funciones las dejamos asi porque son solamente para imprimir por consola el plan y sus materias

        /*try {
            imprimirBase(BaseDeDatos.getPlanes());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/

        

        ModificarPlan modificarPlan = new ModificarPlanImpl();

        /*CrearPlan p = new CrearPlanImpl();

        Plan romper = new PlanImpl();
        romper.setAnio(0);
        romper.setEstadoActivo();
        
        p.crear(romper);*/

        /*boolean si = false;
        
        planes.get(0).getAnios().get(2).setNumero(2);

        si = modificarPlan.modificar(planes.get(0));
        System.out.println("\n\nSe modifico el plan " + planes.get(0) + " ? = " + (si ? "SI" : "NO") );

        planes.get(1).setEstadoBorrador();
        si = modificarPlan.modificar(planes.get(1));
        System.out.println("Se modifico el plan " + planes.get(1) + " ? = " + (si ? "SI" : "NO") );

        planes.get(2).setAnio(2080);
        si = modificarPlan.modificar(planes.get(2));
        System.out.println("Se modifico el plan " + planes.get(2) + " ? = " + (si ? "SI" : "NO") );*/

        /*try {
            imprimirBase(BaseDeDatos.getPlanes());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/

        /*FormatoImprimir.imprimirFormatoLista(planes);

        BuscarEImprimirPlanes buscarImprimir = new BuscarEImprimirPlanesImpl();
        buscarImprimir.buscar("Chi Arg");
        System.out.println("\nAhora buscamos Inglés con tilde");
        buscarImprimir.buscar("Inglés");*/

        /*System.out.println("\n\nBorramos un solo plan");
        BorrarPlan borrarPlan = new BorrarPlanImpl();
        PlanImpl k = new PlanImpl();
        k.setAnio(2001);
        borrarPlan.borrar(k);
         
        FormatoImprimir.imprimirFormato();
        List<PlanImpl> listaBorrar;
        try {
            listaBorrar = BaseDeDatos.getPlanes();
            System.out.println("\n\nBorramos todos los planes borradores de la base de datos");
            BorrarPlanes borrarBaseDeDatos = new BorrarPlanesImpl();
            borrarBaseDeDatos.borrar(listaBorrar);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        FormatoImprimir.imprimirFormato();*/
        
        Server.server();

    } 

    public static void imprimirBase(List<PlanImpl> list) {
        for (Plan plan : list) {
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