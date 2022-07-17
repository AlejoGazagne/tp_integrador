package ar.edu.iua.negocio.academico.profesor;

import ar.edu.iua.modelo.academico.profesores.Profesor;
import ar.edu.iua.persistencia.BaseDeDatos;


public class CrearProfesorImpl {
    public boolean crear(Profesor profe) throws CrearProfesorEx{
  

        try {
            BaseDeDatos.setProfesor(profe);
            return true; 
        } catch (CloneNotSupportedException e) {
            throw new CrearProfesorEx(e.getMessage());
        }

    }
}
