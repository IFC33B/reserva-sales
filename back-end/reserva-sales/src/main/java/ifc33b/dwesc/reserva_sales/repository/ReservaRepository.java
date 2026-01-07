package ifc33b.dwesc.reserva_sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifc33b.dwesc.reserva_sales.model.Reserva;
import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Optional<Reserva> findByNomSalaAndDiaAndHora(String nomSala, LocalDateTime dia, Integer hora);
}
