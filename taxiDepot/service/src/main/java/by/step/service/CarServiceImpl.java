package by.step.service;

import by.step.dao.model.Car;
import by.step.dao.repository.AbstractCarRepository;
import by.step.service.dto.CarDto;
import by.step.service.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements AbstractCarService {

    private final AbstractCarRepository abstractCarRepository;

    private final CarMapper carMapper;

    public CarDto save(CarDto car) {
        return carMapper.carToCarDto(abstractCarRepository.save(carMapper.carDtoToCar(car)));
    }

    public List<CarDto> getAllCars() {
        List<Car> cars = abstractCarRepository.findAll();
        return cars.stream().map(carMapper::carToCarDto).collect(Collectors.toList());
    }

    public Double getPriceAllCars() {
        List<Double> prices = abstractCarRepository.findAll().stream().map(Car::getPrice).collect(Collectors.toList());
        Double sum = 0.0;
        for (Double price : prices) {
            sum += price;
        }
        return sum;
    }

    public CarDto patchCar(Long id, CarDto carDto) {
        abstractCarRepository.updatePriceAndFuelConsumptionAndSpeedAndDriverAndNumberBoardById
                (carDto.getPrice()
                        , carDto.getFuelConsumption()
                        , carDto.getSpeed()
                        , carMapper.carDtoToCar(carDto).getDriver()
                        , carDto.getNumberBoard(), id);
        return carMapper.carToCarDto(abstractCarRepository.getReferenceById(id));
    }

    public List<CarDto> getCarsBySpeedAndFuelConsumption(Double speed, Double fuelConsumption) {
        List<Car> cars = abstractCarRepository.findBySpeedAndFuelConsumption(speed, fuelConsumption);
        return cars.stream().map(carMapper::carToCarDto).collect(Collectors.toList());
    }
}
