package ifc33b.dwesc.reserva_sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifc33b.dwesc.reserva_sales.model.Reserva;
import java.time.LocalDate;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Boolean existsByNomSalaAndDiaAndHora(String nomSala, LocalDate dia, Integer hora);
}
