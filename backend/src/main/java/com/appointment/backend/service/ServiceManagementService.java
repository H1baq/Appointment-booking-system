package com.appointment.backend.service;

import com.appointment.backend.repository.ServiceRepository;
import org.springframework.stereotype.Service;
import com.appointment.backend.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class ServiceManagementService {

    private final ServiceRepository serviceRepository;

    public ServiceManagementService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public com.appointment.backend.model.Service createService(
            com.appointment.backend.model.Service service) {

        return serviceRepository.save(service);
    }

    public List<com.appointment.backend.model.Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public com.appointment.backend.model.Service getServiceById(Long id) {
    return serviceRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Service not found"));
}
}