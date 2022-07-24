package ar.edu.iua.negocio.academico.profesor;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.profesores.Profesor;
import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;
import ar.edu.iua.persistencia.BaseDeDatos;
import ar.edu.iua.util.Transformar;

public class BuscarProfesoresImpl {
    public List<Profesor> buscar(String terminos) throws BuscarProfesorEx{
        boolean ok = false;
        List<Profesor> encontrados = new ArrayList<Profesor>();

        try {
            ok = validar(terminos);
            List<ProfesorImpl> profesores = BaseDeDatos.getProfesores();
            if(ok == true){
                String arrayTerminos[] = terminos.split(" ");
                FOR_PROFESOR:
                for(Profesor profe: profesores){
                    String toFullString = Transformar.traducirCadena(profe.fullToString().toLowerCase());
                    for(String termino : arrayTerminos){
                        if(toFullString.contains(Transformar.traducirCadena(termino.toLowerCase()))){
                            encontrados.add(profe);
                            continue FOR_PROFESOR;
                        }
                    }
                }
                return encontrados;
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return encontrados;
    }

    private boolean validar(String terminos) throws BuscarProfesorEx{
        if(terminos == null) throw new BuscarProfesorEx("No esta buscando nada");
        return true;
    }
}
