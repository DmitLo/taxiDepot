package by.step.service;

import by.step.dao.model.Driver;
import by.step.service.dto.DriverDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AbstractDriverService {

    DriverDto save(DriverDto driverDto);

    List<DriverDto> getAllDrivers();
}
