package ifc33b.dwesc.reserva_sales.exception;

public class SalaOcupadaException extends RuntimeException {
    public SalaOcupadaException(String nomSala) {
        super("La sala " + nomSala + " ya esta reservada para esta fecha a esta hora");
    }
}
