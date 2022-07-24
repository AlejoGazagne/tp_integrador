package ar.edu.iua.modelo.academico.profesores;

import java.util.List;

import ar.edu.iua.modelo.Objeto;
import ar.edu.iua.modelo.academico.plan.MateriaImpl;

public abstract class Profesor extends Objeto {

    abstract public Integer getDni();

    abstract public void setDni(Integer dni);

    abstract public String getNombre();

    abstract public void setNombre(String nombre);

    abstract public List<MateriaImpl> getMaterias();

    abstract public void setMaterias(List<MateriaImpl> materias);

}
