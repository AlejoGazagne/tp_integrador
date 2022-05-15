package ar.edu.iua.interfazusuario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Plan;
import ar.edu.iua.negocio.academico.plan.BuscarPlanes;
import ar.edu.iua.negocio.academico.plan.BuscarPlanesImpl;
import ar.edu.iua.util.FormatoImprimir;

public class BuscarEImprimirPlanesImpl implements BuscarEImprimirPlanes{
    public void buscar(String terminos){
        System.out.println("\n\nPlanes encontrados por: " + terminos);
        List<Plan> planesEncontrados = new ArrayList<>();
        BuscarPlanes buscador = new BuscarPlanesImpl();

        planesEncontrados = buscador.buscar(terminos.toLowerCase());
        
        System.out.println("Total de planes encontrados: " + planesEncontrados.size());
        FormatoImprimir.imprimirFormato(planesEncontrados);
        System.out.println("LISTO");
    }
}
