package ar.edu.iua.modelo.academico.profesores;

import java.util.List;

import ar.edu.iua.modelo.Objeto;
import ar.edu.iua.modelo.academico.plan.Materia;

public abstract class Profesor extends Objeto {

    abstract public Integer getDni();

    abstract public void setDni(Integer dni);

    abstract public String getNombre();

    abstract public void setNombre(String nombre);

    abstract public Double getSueldo();

    abstract public void setSueldo(Double sueldo);

    abstract public List<Materia> getMaterias();

    abstract public void setMaterias(List<Materia> materias);

}
