package ifc33b.dwesc.reserva_sales.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/reserves")
class ReservaController {
    @GetMapping() // Devuelve las reservas
    public int getReserves() {
        return 0;
    }
    
    @PostMapping() // Crea una reserva
    public int createReserva(@RequestBody String entity) {
        return 0;
    }
}