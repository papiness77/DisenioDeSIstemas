import java.util.List;

public class Alumno {
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer legajo, List<Materia> materiasAprobadas) {
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
