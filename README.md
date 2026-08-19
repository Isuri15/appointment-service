# Appointment Service

Microservice responsible for managing veterinary appointment bookings between pet owners and their pets in the Pet Clinic system.

## Student Information
- **Student Name:** Isuri Gamage
- **Student Number:** 241722008
- **Slack Handle:** 
- **GCP Project ID:**

## Project Description
The `appointment-service` manages CRUD operations for veterinary appointments, linking owners and pets by their respective IDs. It tracks appointment date, reason for the visit, and status (PENDING, CONFIRMED, COMPLETED, CANCELLED). This service is registered with Eureka Service Registry, retrieves configuration from the Config Server, and is accessed through the API Gateway.

## Technology Stack
- **Language:** Java 25
- **Framework:** Spring Boot, Spring Cloud, Spring Data JPA
- **Database:** MySQL (Relational Database)
- **Service Discovery:** Netflix Eureka Client
- **Configuration:** Spring Cloud Config Client
- **Build Tool:** Maven
- **Cloud Platform:** Google Cloud Platform (GCP) — deployed as IaaS on Compute Engine VM Instance Groups
- **Process Management:** PM2

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/appointments` | Get all appointments |
| GET | `/api/appointments/{id}` | Get appointment by ID |
| POST | `/api/appointments` | Book a new appointment |
| PUT | `/api/appointments/{id}` | Update an existing appointment |
| DELETE | `/api/appointments/{id}` | Delete/cancel an appointment |

## Setup / Getting Started

### Prerequisites
- Java 25 (JDK)
- Maven
- MySQL Server running locally
- Eureka Server and Config Server running

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/Isuri15/appointment-service.git
   cd appointment-service
   ```
2. Configure MySQL credentials in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=Ijse@1234
   ```
3. Ensure `eureka-server` (port 8761) and `config-server` (port 8888) are running.
4. Build and run the service:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
5. The service will start on port `8083` and auto-register with Eureka.

## Cloud Deployment
This service is deployed on Google Cloud Platform using:
- Compute Engine VM Instance Groups (auto-scaling, multi-zone)
- Cloud SQL (MySQL) as the managed database
- PM2 for process management and automatic restart on the VM

## Related Repositories
This service is part of the Pet Clinic microservices system. See the parent repository:
- [backend-services](https://github.com/Isuri15/backend-services)
