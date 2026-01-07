# Gestor de series y plataformas

Aplicación que gestiona salas de reservas con backend en Spring Boot y frontend en Angular.

## Requisitos

- Java 21
- Maven
- Node.js 18+ (para el frontend)
- npm

## Estructura de Carpetas

### Backend (Spring Boot)
- `back-end/reserva-sales/` - Aplicación Spring Boot
  - `src/main/java/ifc33b/dwesc/reserva_sales/` - Código fuente Java
    - `controller` - Controladores
    - `dto` - Modelos de transferencia entre front y back
    - `model` - Modelos Java
    - `repository` - JPA
    - `service` - Lógica de negocio
    - `exception` - Control de excepciones
  - `src/main/resources/` - Recursos de la aplicación
  - `src/test/` - Tests unitarios
  - `pom.xml` - Dependencias Maven

### Frontend (Angular)
- `front-end/reserva-sales/` - Aplicación Angular
  - `src/app/` - Código Angular
    - `components/` - Componentes reutilizables
    - `models/` - Modelos TypeScript
    - `services/` - Servicios (comunicación con backend)
  - `src/` - Assets y configuración
  - `package.json` - Dependencias npm

## Instalación

### Backend

1. Acceder a la carpeta del backend:
```bash
cd back-end/reserva-sales
```

2. Compilar y ejecutar:
```bash
mvn spring-boot:run
```

El servidor estará disponible en `http://localhost:8080`

### Frontend

1. Acceder a la carpeta del frontend:
```bash
cd front-end/reserva-sales
```

2. Instalar dependencias:
```bash
npm install
```

3. Ejecutar servidor de desarrollo:
```bash
npm start
```

La aplicación estará disponible en `http://localhost:4200`

## Desarrollo

### Backend

El backend está construido con:
- **Spring Boot 3.x** - Framework web
- **Spring Data JPA** - Acceso a datos
- **Maven** - Gestor de dependencias

### Frontend

El frontend está construido con:
- **Angular 18+** - Framework de desarrollo
- **TypeScript** - Lenguaje de programación
- **TailwindCSS** - Estilos
- **npm** - Gestor de dependencias

## Endpoints API

La API está disponible en `http://localhost:8080/api`

### Tabla Resumen de Endpoints

| Método | Ruta | Descripción | Status |
|--------|------|-------------|--------|
| GET | `/api/reserves` | Obtener todas las reservas | 200 |
| POST | `/api/reserves` | Crear una reserva | 201 |

### Endpoints detallados

#### 1. Obtener todas las reservas

**GET** `/api/reserves`

Devuelve la lista de reservas.

**Response (200 OK):**
```json
[
    {
        "dia": "2023-04-01",
        "hora": 12,
        "nomSala": "Sala",
        "usuari": "Cloud"
    },
    {
        "dia": "2023-04-01",
        "hora": 12,
        "nomSala": "Sala2",
        "usuari": "Sefirot"
    }
]
```

---

#### 3. Añadir una nueva reserva

**POST** `/api/reserves`

Crea una nueva reserva.

**Headers:**
```
Content-Type: application/json
```

**Request Body:** (ejemplo)
```json
{
  "nomSala": "Sala2",
  "dia": "2023-04-01",
  "hora": 12,
  "usuari": "Cloud"
}
```

**Parámetros requeridos:**
- `nomSala` (String, obligatorio): Nombre de la sala
- `dia` (String, obligatorio): Dia de la reserva (formato: yyyy-mm-dd)
- `hora` (Integer, obligatorio): Hora de la reserva (formato: desde las 0 hasta las 23)
- `usuari` (String, obligatorio): Nombre de la persona que reserva

**Response (201 Created):**
```json
{
    "dia": "2023-04-01",
    "hora": 12,
    "nomSala": "Sala",
    "usuari": "Cloud"
}
```

---

### Ejemplos con cURL

Obtener reservas:
```bash
curl -X GET "http://localhost:8080/api/reserves"
```

Crear una reserva:
```bash
curl -v -X POST "http://localhost:8080/api/reserves" -H "Content-Type: application/json" --data-raw '{"nomSala": "Sala", "dia": "2026-01-20", "hora": 23, "usuari": "Cloud"}'
```

## Estructura del Proyecto

```
reserva-sales/
├── README.md
├── back-end/
│   └── reserva-sales/
│       ├── mvnw
│       ├── mvnw.cmd
│       ├── pom.xml
│       ├── src/
│       │   ├── main/
│       │   │   ├── java/ifc33b/dwesc/reserva-sales/
│       │   │   │   ├── ReservaSalesApplication.java
│       │   │   │   ├── controller/
│       │   │   │   │   └── ReservaController.java
│       │   │   │   ├── dto/
│       │   │   │   │   ├── ReservaResponse.java
│       │   │   │   │   └── ReservaRequest.java
│       │   │   │   ├── model/
│       │   │   │   │   └── Reserva.java
│       │   │   │   ├── repository/
│       │   │   │   │   └──   ReservaRepository.java
│       │   │   │   ├── service/
│       │   │   │   │   └──  ReservaService.java
│       │   │   │   └── exception/
│       │   │   │       ├── GlobalExceptionHandler.java
│       │   │   │       └── SalaOcupadaException.java
│       │   │   └── resources/
│       │   │       └── application.properties
│       │   └── test/
│       │       └── java/ifc33b/dwesc/ranking/
│       │           └── ReservaSalesApplicationTests.java
│       └── target/ (generado por Maven)
└── front-end/
    └── reserva-sales/
        ├── angular.json
        ├── package.json
        ├── tsconfig.json
        ├── tsconfig.app.json
        ├── tsconfig.spec.json
        ├── README.md
        ├── public/
        ├── src/
        │   ├── index.html
        │   ├── main.ts
        │   ├── styles.scss
        │   └── app/
        │       ├── app.config.ts
        │       ├── app.html
        │       ├── app.routes.ts
        │       ├── app.scss
        │       ├── app.ts
        │       ├── app.spec.ts
        │       ├── components/
        │       │   ├── formulari-reserva/
        │       │   │   ├── formulari-reserva.html
        │       │   │   ├── formulari-reserva.scss
        │       │   │   ├── formulari-reserva.ts
        │       │   │   └── formulari-reserva.spec.ts
        │       │   └── llista-reserves/
        │       │       ├── llista-reserves.html
        │       │       ├── llista-reserves.scss
        │       │       ├── llista-reserves.ts
        │       │       └── llista-reserves.spec.ts
        │       ├── models/
        │       │   ├── index.ts
        │       │   ├── reserva.model.ts
        │       │   └── reserva.model.spec.ts
        │       └── services/
        │           ├── reserva.service.ts
        │           └── reserva.service.spec.ts
```