package by.step.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {

    private Long id;
    private Double price;
    private Double fuelConsumption;
    private Double speed;
    private DriverDto driverDto;
    private String numberBoard;
}
