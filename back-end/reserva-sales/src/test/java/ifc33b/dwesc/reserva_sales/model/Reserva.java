package ifc33b.dwesc.reserva_sales.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "reserves")
public class Reserva {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre de la sala es obligatorio")
    @Column(nullable = false)
    private String nomSala;

    @NotNull(message = "El dia es obligatorio")
    @Column(nullable = false)
    private LocalDateTime dia;

    @NotNull(message = "La hora es obligatoria")
    @Min(value = 0, message = "La hora mínima es 0")
    @Max(value = 23, message = "La hora máxima es 23")
    @Column(nullable = false)
    private Integer hora;

    @NotBlank(message = "El nombre de usuario es obligatorio")
    @Column(nullable = false)
    private String usuari;
}
