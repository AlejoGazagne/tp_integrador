package ar.edu.iua.negocio.academico.profesor;

import ar.edu.iua.modelo.academico.profesores.Profesor;
import ar.edu.iua.persistencia.BaseDeDatos;

public class ModificarProfesorImpl {
    public boolean modificar(Profesor profesor) throws ModificarProfesorEx{
        
        try {
            for (int ii = 0; ii < BaseDeDatos.getProfesores().size(); ii++) {
                if (BaseDeDatos.getProfesores().get(ii).getDni().equals(profesor.getDni())) {
                    BaseDeDatos.modifyProfesor(ii, (Profesor) profesor.clone());
                    return true;
                }
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
}
