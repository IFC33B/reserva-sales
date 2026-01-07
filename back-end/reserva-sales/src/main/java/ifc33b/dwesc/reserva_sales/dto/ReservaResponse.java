package ifc33b.dwesc.reserva_sales.dto;

import java.time.LocalDateTime;

import ifc33b.dwesc.reserva_sales.model.Reserva;
import lombok.Data;

@Data
public class ReservaResponse {
    private String nomSala;
    private LocalDateTime dia;
    private Integer hora;
    private String usuari;

    public ReservaResponse(Reserva reserva) {
        this.setNomSala(reserva.getNomSala());
        this.setDia(reserva.getDia());
        this.setHora(reserva.getHora());
        this.setUsuari(reserva.getUsuari());
    }
}
