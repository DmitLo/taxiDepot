package by.step.service;

import by.step.service.dto.CarDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AbstractCarService {

    CarDto save(CarDto carDto);

    List<CarDto> getAllCars();

    Double getPriceAllCars();

    CarDto patchCar(Long id, CarDto carDto);

    List<CarDto> getCarsBySpeedAndFuelConsumption(Double speed, Double fuelConsumption);
}
