package sv.edu.udb.desafiopractico1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.desafiopractico1.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {}