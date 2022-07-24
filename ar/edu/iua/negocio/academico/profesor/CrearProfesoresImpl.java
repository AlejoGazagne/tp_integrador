package ar.edu.iua.negocio.academico.profesor;

import java.util.List;

import ar.edu.iua.modelo.academico.profesores.ProfesorImpl;

public class CrearProfesoresImpl {
    public boolean crear(List<ProfesorImpl> creadoList) throws CrearProfesorEx{

        CrearProfesorImpl crearProfesor = new CrearProfesorImpl();

        if(creadoList == null) return false;
        
        for(int i = 0; i < creadoList.size(); i++){
            crearProfesor.crear(creadoList.get(i));
        }

        return true;
    }
}
