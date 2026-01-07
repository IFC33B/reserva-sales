import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Reserva, ReservaRequest } from '../models/reserva.model';

@Injectable({
  providedIn: 'root',
})
export class ReservaService {
  private apiUrl = "http://localhost:8080/api/reserves"

  constructor(private http: HttpClient) { }

  // Obtener todas las reservas
  getReserves(): Observable<Reserva[]> {
    return this.http.get<Reserva[]>(this.apiUrl)
      .pipe(
        catchError(this.handleError)
      )
  }

  // Crear una reserva
  createReserva(request: ReservaRequest): Observable<Reserva> {
    return this.http.post<Reserva>(this.apiUrl, request)
      .pipe(
        catchError(this.handleError)
      )
  }

  // Gestión de errores
  private handleError(error: HttpErrorResponse) {
    let errorMessage = 'Error desconocido';

    if (error.error instanceof ErrorEvent) {
      // Error del cliente
      errorMessage = `Error: ${error.error.message}`
    } else {
      // Error del servidor
      errorMessage = `Codigo de error: ${error.status}, Mensaje: ${error.message}`;
    }

    console.log(errorMessage);
    return throwError(() => ({
      status: error.status,
      message: errorMessage,
      error: error.error
    }))
  }
}