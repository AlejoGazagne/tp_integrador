package ar.edu.iua.negocio.academico.profesor;

import java.util.List;

import ar.edu.iua.modelo.academico.profesores.Profesor;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BorrarProfesorImpl {
    public boolean borrar(Profesor profesor) throws BorrarProfesorEx{
        if(profesor != null) {
            try {
                List<Profesor> profes = BaseDeDatos.getProfesores();
                for(int i = 0; i < profes.size(); i++){
                    if(profes.get(i).getDni().equals(profesor.getDni())){
                        BaseDeDatos.deleteProfesor(i);
                        return true;
                    }
                }
            } catch (CloneNotSupportedException e) {
                throw new BorrarProfesorEx(e.getMessage());
            }
            
        }

        return false;
    }
}
