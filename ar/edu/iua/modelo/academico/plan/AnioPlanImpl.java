package ar.edu.iua.modelo.academico.plan;

import java.util.ArrayList;
import java.util.List;

public class AnioPlanImpl extends AnioPlan {

    private Plan plan;
    private Integer numero;
    private String nombre;
    private List<Materia> materias = new ArrayList<Materia>();

    public AnioPlanImpl(Plan plan, Integer numero, String nombre) {
        this.plan = plan;
        this.numero = numero;
        this.nombre = nombre;
    }
    public AnioPlanImpl() {
  
    }

    public Plan getPlan() {
        return plan;
    }

   public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = (nombre != null && nombre.trim().length() > 0) ? nombre.trim() : null;
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    // ----

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AnioPlanImpl other = (AnioPlanImpl) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }

    public String toString() {
        return nombre != null ? nombre : (numero != null ? "Año " + numero : "Año sin identificación");
    }

    public String fullToString() {

        String z = (numero != null ? numero.toString() : "") + "\n" + (nombre != null ? nombre.toString() : "") + "\n";

        for(Materia materia : materias){
            String m = materia.fullToString().trim();
            z += ( m.length() > 0 ) ? m + "\n" : "";
        }
                
        return z.trim();
    }

    public String fullToJson(){

        String j = (numero != null ? "{\n \"anio\" : " + numero.toString() + ", " : "") + "\n" + (nombre != null ? " \"nombre\" : \"" + nombre.toString() + "\" , " : "") + "\n";

        for(int i = 0; i < materias.size(); i++){
            String m = materias.get(i).fullToJson();
            if(i == materias.size() - 1){
                j += ( m.length() > 0 ) ? m + "\n" : "";
            } else {
                j += (m.length() > 0) ? m + "," : "";
            }
            
        }
        
        j += " ]\n }";

        return j.trim();
    }
}
