package ar.edu.iua.negocio.academico.profesor;

import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;
import ar.edu.iua.persistencia.BaseDeDatos;


public class CrearProfesorImpl {
    public boolean crear(ProfesorImpl profe) throws CrearProfesorEx{

        try {
            BaseDeDatos.setProfesor((ProfesorImpl) profe);
            return true; 
        } catch (CloneNotSupportedException e) {
            throw new CrearProfesorEx(e.getMessage());
        }

    }
}