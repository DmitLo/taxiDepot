package by.step.controller;

import by.step.service.AbstractCarService;
import by.step.service.dto.CarDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
@Tag(name = "car app", description = "controller for work with cars")
public class CarController {

    private final AbstractCarService abstractCarService;

    public CarController(AbstractCarService abstractCarService) {
        this.abstractCarService = abstractCarService;
    }

    @Operation(summary = "method post", description = "save car with method post")
    @PostMapping("save car")
    public CarDto saveCar(@RequestBody CarDto carDto) {
        return abstractCarService.save(carDto);
    }

    @Operation(summary = "method get", description = "get all cars with method get")
    @GetMapping("get all cars")
    public List<CarDto> getAllCars() {
        return abstractCarService.getAllCars();
    }

    @Operation(summary = "method get", description = "get price all cars with method get")
    @GetMapping("price of all cars")
    public Double getPriceAllCars() {
        return abstractCarService.getPriceAllCars();
    }

    @Operation(summary = "method get", description = "get all cars by speed and fuel with method get")
    @GetMapping("get cars by speed and consumption")
    public List<CarDto> getCarsBySpeedAndFuelConsumption(@RequestBody Double speed, Double fuelConsumption) {
        return abstractCarService.getCarsBySpeedAndFuelConsumption(speed, fuelConsumption);
    }

    @Operation(summary = "method patch", description = "patch cars by id with method patch")
    @PatchMapping("update car")
    public CarDto patchCar(@RequestParam Long id, @RequestBody CarDto carDto) {
        return abstractCarService.patchCar(id, carDto);
    }
}
