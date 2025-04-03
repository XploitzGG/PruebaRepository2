package mx.uam.libreria.prueba.repositorio;

import mx.uam.libreria.prueba.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
}