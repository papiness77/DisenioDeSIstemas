import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @org.junit.jupiter.api.Test
    void aprobada() {
        List<Materia> listaVacia = new ArrayList<Materia>();
        Materia materia1 = new Materia("AM1", listaVacia);

        List<Materia> lista = new ArrayList<Materia>();
        lista.add(materia1);

        Materia materia2 = new Materia("AM2", lista);

        Alumno alumno1 = new Alumno(12, listaVacia);
        Alumno alumno2 = new Alumno(12, lista);

        List<Materia> lista2 = new ArrayList<Materia>();
        lista2.add(materia1);
        lista2.add(materia2);

        Inscripcion inscripcion1 = new Inscripcion(alumno1, lista);
        Inscripcion inscripcion2 = new Inscripcion(alumno1, lista2);


        Assertions.assertEquals(inscripcion1.aprobada(), true);
        Assertions.assertEquals(inscripcion2.aprobada(), false);


    }

}