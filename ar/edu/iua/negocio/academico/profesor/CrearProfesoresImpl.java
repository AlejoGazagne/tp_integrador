package ar.edu.iua.negocio.academico.profesor;

import java.util.List;

import ar.edu.iua.modelo.academico.profesores.Profesor;

public class CrearProfesoresImpl {
    public boolean crear(List<Profesor> profesores) throws CrearProfesorEx{

        CrearProfesorImpl crearProfesor = new CrearProfesorImpl();

        if(profesores == null) return false;
        
        for(int ii = 0; ii < profesores.size(); ii++){
            crearProfesor.crear(profesores.get(ii));
        }

        return true;
    }
}
