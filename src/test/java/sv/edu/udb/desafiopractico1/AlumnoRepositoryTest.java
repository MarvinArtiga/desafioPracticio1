package sv.edu.udb.desafiopractico1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.desafiopractico1.repository.AlumnoRepository;
import sv.edu.udb.desafiopractico1.repository.MateriaRepository;

@SpringBootTest
@Transactional
public class AlumnoRepositoryTest {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Test
    @Commit
    public void insertarRegistros() {
        // Creamos una materia
        Materia materia1 = new Materia();
        materia1.setNombre("Geografía");
        materiaRepository.save(materia1);

        // Creamos un alumno asociado a la materia
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Pedro");
        alumno1.setApellido("Sánchez");
        alumno1.setIdMateria(materia1.getId());
        alumnoRepository.save(alumno1);

        // Creamos una segunda materia
        Materia materia2 = new Materia();
        materia2.setNombre("Biología");
        materiaRepository.save(materia2);

        // Creamos un segundo alumno asociado a la segunda materia
        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Lucía");
        alumno2.setApellido("García");
        alumno2.setIdMateria(materia2.getId());
        alumnoRepository.save(alumno2);
    }
}
