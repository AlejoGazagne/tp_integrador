package ar.edu.iua.modelo.academico.plan;

import java.util.List;

import ar.edu.iua.modelo.Objeto;

public abstract class Plan extends Objeto {

    public Plan() {
    }

    abstract public Integer getAnio();

    abstract public void setAnio(Integer anio);

    abstract public void setEstadoBorrador();

    abstract public void setEstadoActivo();

    abstract public void setEstadoNoActivo();

    abstract public boolean isEstadoBorrador();

    abstract public boolean isEstadoActivo();

    abstract public boolean isEstadoNoActivo();

    abstract public List<AnioPlanImpl> getAnios();

    abstract public void setAnios(List<AnioPlanImpl> anios);

}
