package ar.edu.iua.negocio.academico.profesor;

import java.util.List;

import ar.edu.iua.modelo.academico.profesores.Profesor;

public class ModificarProfesoresImpl {
    public boolean modificar(List<Profesor> profesores) throws ModificarProfesorEx{

        ModificarProfesorImpl modificarProfe = new ModificarProfesorImpl();
        boolean ok = false; 

        if(profesores == null) return false;
        for(int i = 0; i < profesores.size(); i++){
            ok = modificarProfe.modificar(profesores.get(i));
        }

        return ok;
    }
    
}
