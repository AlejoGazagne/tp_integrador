package ar.edu.iua.negocio.academico.profesor;

import java.util.List;

import ar.edu.iua.modelo.academico.profesores.Profesor;

public class BorrarProfesoresImpl {
    public boolean borrar(List<Profesor> profesores) throws BorrarProfesorEx{
        if(profesores == null) return false;
        for(int i = 0; i < profesores.size(); i++){
            BorrarProfesorImpl borrarProfe = new BorrarProfesorImpl();
            borrarProfe.borrar(profesores.get(i));
        }

        return true;
    }
}
