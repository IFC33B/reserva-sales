package ifc33b.dwesc.reserva_sales.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifc33b.dwesc.reserva_sales.dto.ReservaRequest;
import ifc33b.dwesc.reserva_sales.dto.ReservaResponse;
import ifc33b.dwesc.reserva_sales.exception.SalaOcupadaException;
import ifc33b.dwesc.reserva_sales.model.Reserva;
import ifc33b.dwesc.reserva_sales.repository.ReservaRepository;
import java.time.LocalDate;

@Service
public class ReservaService {
    @Autowired
    ReservaRepository reservaRepository;

    // Devuelve todas las reservas
    public List<ReservaResponse> getReserves() {
        return reservaRepository.findAll().stream()
                .map(ReservaResponse::new)
                .collect(Collectors.toList());
    }

    // Crea una reserva
    public ReservaResponse createReserva(ReservaRequest request) {
        LocalDate dia = LocalDate.parse(request.getDia());

        if (reservaRepository.existsByNomSalaAndDiaAndHora(request.getNomSala(), dia, request.getHora())) {
            throw new SalaOcupadaException(request.getNomSala());
        }

        Reserva reserva = new Reserva(request.getNomSala(), request.getDia(), request.getHora(), request.getUsuari());
        reservaRepository.save(reserva);
        return new ReservaResponse(reserva);
    }
}
