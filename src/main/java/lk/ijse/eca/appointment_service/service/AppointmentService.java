package lk.ijse.eca.appointment_service.service;

import lk.ijse.eca.appointment_service.model.Appointment;
import lk.ijse.eca.appointment_service.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found with id: " + id));
    }

    public Appointment createAppointment(Appointment appointment) {
        appointment.setStatus("PENDING");
        return appointmentRepository.save(appointment);
    }

    public Appointment updateAppointment(Long id, Appointment details) {
        Appointment appointment = getAppointmentById(id);
        appointment.setAppointmentDate(details.getAppointmentDate());
        appointment.setReason(details.getReason());
        appointment.setStatus(details.getStatus());
        return appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}