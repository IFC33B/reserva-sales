export interface Reserva {
    nomSala: string;
    dia: string;
    hora: number;
    usuari: string
}

export interface ReservaRequest {
    nomSala: string;
    dia: string;
    hora: number;
    usuari: string
}