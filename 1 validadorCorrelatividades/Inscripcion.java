import java.util.List;

public class Inscripcion {
    private Alumno alumnoSolicitante;
    private List<Materia> materiasSolicitadas;


    public Inscripcion(Alumno alumnoSolicitante, List<Materia> materiasSolicitadas) {
        this.alumnoSolicitante = alumnoSolicitante;
        this.materiasSolicitadas = materiasSolicitadas;
    }

    boolean aprobada(){
        for (Materia materia : this.materiasSolicitadas) {
            if(materia.cumpleCorrelativas(alumnoSolicitante.getMateriasAprobadas())) continue;
            else return false;
        }
        return true;
    }
}
