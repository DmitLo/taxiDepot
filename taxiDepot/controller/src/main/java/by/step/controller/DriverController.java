package by.step.controller;


import by.step.dao.model.Driver;
import by.step.service.AbstractDriverService;
import by.step.service.dto.DriverDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/drivers")
@Tag(name = "driver app", description = "controller for work with drivers")
public class DriverController {

    private final AbstractDriverService abstractDriverService;

    public DriverController(AbstractDriverService abstractDriverService) {
        this.abstractDriverService = abstractDriverService;
    }

    @Operation(summary = "method post", description = "save driver with method post")
    @PostMapping
    public DriverDto saveDriver(@RequestBody DriverDto driverDto) {
        return abstractDriverService.save(driverDto);
    }

    @Operation(summary = "method get", description = "get all driver with method get")
    @GetMapping
    public List<DriverDto> getAllDrivers() {
        return abstractDriverService.getAllDrivers();
    }
}
