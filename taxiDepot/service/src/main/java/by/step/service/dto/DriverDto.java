package by.step.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverDto {

    private Long id;
    private String name;
    private String lastName;
    private ContractDto contractDto;
    private CarDto carDto;
}
