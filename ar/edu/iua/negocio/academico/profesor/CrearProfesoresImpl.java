package ar.edu.iua.negocio.academico.profesor;

import java.util.List;

import ar.edu.iua.modelo.academico.profesores.Profesor;

public class CrearProfesoresImpl {
    public boolean crear(List<Profesor> profesores) throws CrearProfesorEx{

        CrearProfesorImpl crearProfesor = new CrearProfesorImpl();

        if(profesores == null) return false;
        
        for(int i = 0; i < profesores.size(); i++){
            crearProfesor.crear(profesores.get(i));
        }

        return true;
    }
}
