package ifc33b.dwesc.reserva_sales.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    // Sala ocupada
    @ExceptionHandler(SalaOcupadaException.class)
    public ResponseEntity<ErrorResponse> handleSalaOcupadaException(SalaOcupadaException ex) {
        ErrorResponse error = ErrorResponse.create(ex, HttpStatus.CONFLICT, ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.CONFLICT);
    }
}