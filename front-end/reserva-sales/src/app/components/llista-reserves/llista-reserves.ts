import { HttpErrorResponse } from '@angular/common/http';
import { Component, signal } from '@angular/core';
import { Reserva } from '../../models/reserva.model';

@Component({
  selector: 'app-llista-reserves',
  imports: [],
  templateUrl: './llista-reserves.html',
  styleUrl: './llista-reserves.css',
})
export class LlistaReserves {
  reserves = signal<Reserva | null>(null);
  carregant = signal(false);
  error = signal<HttpErrorResponse | null>(null);
}
