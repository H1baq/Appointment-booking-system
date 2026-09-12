package com.appointment.backend.controller;

import com.appointment.backend.model.Service;
import com.appointment.backend.service.ServiceManagementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@RestController
public class ServiceController {

    private final ServiceManagementService serviceManagementService;

    public ServiceController(ServiceManagementService serviceManagementService) {
        this.serviceManagementService = serviceManagementService;
    }

    @PostMapping("/api/services")
    public Service createService(@RequestBody Service service) {
        return serviceManagementService.createService(service);
    }
    @GetMapping("/api/services")
public List<Service> getAllServices() {
    return serviceManagementService.getAllServices();
}
}