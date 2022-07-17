package ar.edu.iua.modelo.academico.profesores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.iua.modelo.academico.plan.Materia;

public class ProfesorImpl extends Profesor{
    
    private Integer dni;
    private String nombre;
    private List<Materia> materias = new ArrayList<Materia>();
    
    public ProfesorImpl(Integer dni, String nombre, List<Materia> materias) {
        this.dni = dni;
        this.nombre = nombre;
        this.materias = materias;
    }
    
    public ProfesorImpl(){

    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }

    public List<Materia> getMaterias() {
        return materias;
    } 

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    // --

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProfesorImpl other = (ProfesorImpl) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    public String toString() {
        return "ProfesorImpl [dni=" + dni + ", materias=" + materias + ", nombre=" + nombre + "]";
    }

    public String fullToString() {
        // TODO Auto-generated method stub
        return null;
    }

    public String fullToJson() {
        // TODO Auto-generated method stub
        return null;
    }
}
