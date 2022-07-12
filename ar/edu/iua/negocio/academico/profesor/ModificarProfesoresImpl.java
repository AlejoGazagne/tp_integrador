package ar.edu.iua.negocio.academico.profesor;

import java.util.List;

import ar.edu.iua.modelo.academico.profesores.Profesor;

public class ModificarProfesoresImpl {
    public boolean modificar(List<Profesor> profesores) throws ModificarProfesorEx{

        ModificarProfesorImpl modificarProfe = new ModificarProfesorImpl();
        boolean ok = false; 

        if(profesores == null) return false;
        for(int ii = 0; ii < profesores.size(); ii++){
            ok = modificarProfe.modificar(profesores.get(ii));
        }

        return ok;
    }
    
}
