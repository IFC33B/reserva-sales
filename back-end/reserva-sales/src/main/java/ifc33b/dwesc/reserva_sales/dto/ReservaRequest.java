package ifc33b.dwesc.reserva_sales.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReservaRequest {
    // Atributos
    @NotBlank(message = "El nombre de la sala es obligatorio")
    private String nomSala;

    @NotNull(message = "El dia es obligatorio")
    private String dia;

    @NotNull(message = "La hora es obligatoria")
    @Min(value = 0, message = "La hora mínima es 0")
    @Max(value = 23, message = "La hora máxima es 23")
    private Integer hora;

    @NotBlank(message = "El nombre de usuario es obligatorio")
    private String usuari;

    // Constructores
    public ReservaRequest (String nomSala, String dia, Integer hora, String usuari) {
        this.setNomSala(nomSala);
        this.setDia(dia);
        this.setHora(hora);
        this.setUsuari(usuari);
    }
}
