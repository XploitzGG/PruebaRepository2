package mx.uam.libreria.prueba.repositorio;

import mx.uam.libreria.prueba.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Métodos personalizados si es necesario
    Cliente findByEmail(String email);
}