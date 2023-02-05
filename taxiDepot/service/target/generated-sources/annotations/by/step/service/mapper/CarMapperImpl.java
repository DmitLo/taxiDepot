package by.step.service.mapper;

import by.step.dao.model.Car;
import by.step.service.dto.CarDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-05T13:13:46+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.17 (BellSoft)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public Car carDtoToCar(CarDto carDto) {
        if ( carDto == null ) {
            return null;
        }

        Car car = new Car();

        car.setId( carDto.getId() );
        car.setPrice( carDto.getPrice() );
        car.setFuelConsumption( carDto.getFuelConsumption() );
        car.setSpeed( carDto.getSpeed() );
        car.setNumberBoard( carDto.getNumberBoard() );

        return car;
    }

    @Override
    public CarDto carToCarDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setId( car.getId() );
        carDto.setPrice( car.getPrice() );
        carDto.setFuelConsumption( car.getFuelConsumption() );
        carDto.setSpeed( car.getSpeed() );
        carDto.setNumberBoard( car.getNumberBoard() );

        return carDto;
    }

    @Override
    public Car updateCarFromCarDto(CarDto carDto, Car car) {
        if ( carDto == null ) {
            return car;
        }

        if ( carDto.getPrice() != null ) {
            car.setPrice( carDto.getPrice() );
        }
        if ( carDto.getFuelConsumption() != null ) {
            car.setFuelConsumption( carDto.getFuelConsumption() );
        }
        if ( carDto.getSpeed() != null ) {
            car.setSpeed( carDto.getSpeed() );
        }
        if ( carDto.getNumberBoard() != null ) {
            car.setNumberBoard( carDto.getNumberBoard() );
        }

        return car;
    }
}
