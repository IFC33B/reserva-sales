package ifc33b.dwesc.reserva_sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifc33b.dwesc.reserva_sales.dto.ReservaRequest;
import ifc33b.dwesc.reserva_sales.dto.ReservaResponse;
import ifc33b.dwesc.reserva_sales.service.ReservaService;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/reserves")
class ReservaController {
    @Autowired
    ReservaService reservaService;

    @GetMapping() // Devuelve las reservas
    public ResponseEntity<List<ReservaResponse>> getReserves() {
        // Service
        List<ReservaResponse> response = reservaService.getReserves();

        // HTTP Response
        return ResponseEntity.ok(response);
    }
    
    @PostMapping() // Crea una reserva
    public ResponseEntity<ReservaResponse> createReserva(@Valid @RequestBody ReservaRequest request) {
        // Service
        ReservaResponse response = reservaService.createReserva(request);

        // HTTP Response
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}