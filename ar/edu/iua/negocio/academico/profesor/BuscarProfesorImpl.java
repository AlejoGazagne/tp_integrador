package ar.edu.iua.negocio.academico.profesor;

import java.util.List;

import ar.edu.iua.modelo.ObjetoEx;
import ar.edu.iua.modelo.academico.profesores.Profesor;
import ar.edu.iua.persistencia.BaseDeDatos;

public class BuscarProfesorImpl {
    public Profesor buscar(int dni) throws BuscarProfesorEx{
        boolean ok = false;
        try {
            ok = validacion(dni);
            if(ok == true){
                List<Profesor> profesores = BaseDeDatos.getProfesores();
                for(int i = 0; i < profesores.size(); i++){
                    if(profesores.get(i).getDni().equals(dni)) return profesores.get(i);
                }
                
            }
        } catch (ObjetoEx e) {
            throw new BuscarProfesorEx(e.getMessage());
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } 
        return null;
    }
    
    private boolean validacion(int dni) throws ObjetoEx{
        if(dni < 25000000 || dni > 41000000) throw new ObjetoEx("Busca bien porfavor"); 
        return true;
    }
}
