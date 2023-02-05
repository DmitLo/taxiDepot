package by.step.service;

import by.step.dao.model.Driver;
import by.step.dao.repository.AbstractDriverRepository;
import by.step.service.dto.DriverDto;
import by.step.service.mapper.DriverMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class DriverServiceImpl implements AbstractDriverService {

    private final AbstractDriverRepository abstractDriverRepository;

    private final DriverMapper driverMapper;

    @Override
    public DriverDto save(DriverDto driverDto) {
        return driverMapper.driverToDriverDto(abstractDriverRepository.save(driverMapper.driverDtoToDriver(driverDto)));
    }

    @Override
    public List<DriverDto> getAllDrivers() {
        List<Driver> drivers = abstractDriverRepository.findAll();
        return drivers.stream().map(driverMapper::driverToDriverDto).collect(Collectors.toList());
    }
}
