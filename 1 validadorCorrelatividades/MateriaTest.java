import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @org.junit.jupiter.api.Test
    void cumpleCorrelativas() {
        List<Materia> listaVacia = new ArrayList<Materia>();
        Materia materia1 = new Materia("AM1", listaVacia);

        List<Materia> lista = new ArrayList<Materia>();
        lista.add(materia1);

        Materia materia2 = new Materia("AM2", lista);

        Alumno alumno1 = new Alumno(12, listaVacia);
        Alumno alumno2 = new Alumno(12, lista);

        Assertions.assertEquals(materia2.cumpleCorrelativas(alumno1.getMateriasAprobadas()), false);
        Assertions.assertEquals(materia2.cumpleCorrelativas(alumno2.getMateriasAprobadas()), true);


    }
}