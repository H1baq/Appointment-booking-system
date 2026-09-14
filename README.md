# Appointment Booking System

An appointment booking platform for independent consultants and small professional-service businesses.

The system is being built with a **Spring Boot backend, PostgreSQL database, React frontend, and n8n automation**. The goal is to support the full client journey from initial inquiry and service selection to booking, payment, consultation, and follow-up.

## Technology Stack

* **Backend:** Java 21 + Spring Boot
* **Database:** PostgreSQL
* **Frontend:** React + TypeScript
* **Automation:** n8n
* **AI:** Gemini
* **Payments:** M-Pesa Daraja
* **Messaging:** WhatsApp Cloud API
* **Calendar:** Google Calendar

## Project Structure

```text
Appointment-booking-system/
├── backend/       # Spring Boot backend
├── frontend/      # React frontend
├── workflows/     # n8n workflows
├── docs/          # Project documentation
└── README.md
```

## Backend

The backend is responsible for the application's core business logic, API endpoints, database operations, and data management.

Current backend functionality includes:

* Create a service
* Get all services
* Get a service by ID
* Update a service
* Handle missing resources with `404 Not Found`

### API Endpoints

| Method | Endpoint             | Description         |
| ------ | -------------------- | ------------------- |
| POST   | `/api/services`      | Create a service    |
| GET    | `/api/services`      | Get all services    |
| GET    | `/api/services/{id}` | Get a service by ID |
| PUT    | `/api/services/{id}` | Update a service    |

## Running the Backend

Navigate to the backend directory:

```bash
cd backend
```

Start the Spring Boot application:

```bash
./mvnw spring-boot:run
```

The API runs on:

```text
http://localhost:8080
```

## Database

The application uses PostgreSQL.

Local development database:

```text
Database: appointment_db
Port: 5432
```

Database configuration is stored in:

```text
backend/src/main/resources/application.properties
```

Sensitive credentials should be moved to environment variables before deploying the application.

## API Testing

The API can be tested using **Postman** or `curl`.

Example:

```bash
curl http://localhost:8080/api/services
```

## Project Goal

The long-term goal is to provide more than basic appointment scheduling.

The platform is designed around the client journey:

```text
Inquiry
   ↓
AI Qualification
   ↓
Service Match
   ↓
Booking
   ↓
M-Pesa Payment
   ↓
Confirmation
   ↓
Pre-consultation Intake
   ↓
AI Client Brief
   ↓
Consultation
   ↓
Follow-up
   ↓
Proposal
   ↓
Conversion
   ↓
Retention / Rebooking
```
