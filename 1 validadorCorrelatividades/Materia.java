import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;


    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public Boolean cumpleCorrelativas(List<Materia> materiasAprobadas) {
        for (Materia materia : this.correlativas) {
            if (materiasAprobadas.contains(materia)) continue;
            else return false;
        }
        return true;
    }

}

