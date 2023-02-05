package by.step.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class ContractDto {

    private Long id;
    private String number;
    private Date date;
    private DriverDto driverDto;
}
