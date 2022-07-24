package ar.edu.iua.negocio.academico.profesor;

import ar.edu.iua.modelo.academico.profesores.Profesor;
import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;
import ar.edu.iua.persistencia.BaseDeDatos;

public class ModificarProfesorImpl {
    public boolean modificar(Profesor profesor) throws ModificarProfesorEx{
        
        try {
            for (int i = 0; i < BaseDeDatos.getProfesores().size(); i++) {
                if (BaseDeDatos.getProfesores().get(i).getDni().equals(profesor.getDni())) {
                    BaseDeDatos.modifyProfesor(i, (ProfesorImpl) profesor.clone());
                    return true;
                }
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
}
