package ar.edu.iua.interfazusuario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.ObjetoEx;
import ar.edu.iua.modelo.academico.plan.PlanImpl;
import ar.edu.iua.negocio.academico.plan.BuscarPlanes;
import ar.edu.iua.negocio.academico.plan.BuscarPlanesImpl;
import ar.edu.iua.util.FormatoImprimir;

public class BuscarEImprimirPlanesImpl implements BuscarEImprimirPlanes{
    public void buscar(String terminos){
        System.out.println("\n\nPlanes encontrados por: " + terminos);
        List<PlanImpl> planesEncontrados = new ArrayList<>();
        BuscarPlanes buscador = new BuscarPlanesImpl();

        try {
            planesEncontrados = buscador.buscar(terminos.toLowerCase());
        } catch (ObjetoEx e) {
            e.printStackTrace();
        }
        
        System.out.println("Total de planes encontrados: " + planesEncontrados.size());
        FormatoImprimir.imprimirFormatoLista(planesEncontrados);
        System.out.println("LISTO");
    }
}
