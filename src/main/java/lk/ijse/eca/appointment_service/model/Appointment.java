package lk.ijse.eca.appointment_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ownerId;
    private String petId; // MongoDB pet id (String)
    private LocalDateTime appointmentDate;
    private String reason;
    private String status; // PENDING, CONFIRMED, COMPLETED, CANCELLED
}