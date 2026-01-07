package ifc33b.dwesc.reserva_sales.dto;

import ifc33b.dwesc.reserva_sales.model.Reserva;
import lombok.Data;

@Data
public class ReservaResponse {
    private String nomSala;
    private String dia;
    private Integer hora;
    private String usuari;

    public ReservaResponse(Reserva reserva) {
        this.setNomSala(reserva.getNomSala());
        this.setHora(reserva.getHora());
        this.setUsuari(reserva.getUsuari());

        String diaString = reserva.getDia().toString();
        this.setDia(diaString);
    }
}
