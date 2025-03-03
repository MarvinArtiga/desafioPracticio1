package sv.edu.udb.desafiopractico1;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private Long idMateria;

    public void setNombre(String pedro) {
    }

    public void setApellido(String sánchez) {
    }

    public void setIdMateria(Object id) {

    }
}