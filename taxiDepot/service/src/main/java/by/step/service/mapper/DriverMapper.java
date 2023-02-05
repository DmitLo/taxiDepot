package by.step.service.mapper;

import by.step.dao.model.Car;
import by.step.dao.model.Driver;
import by.step.service.dto.CarDto;
import by.step.service.dto.DriverDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DriverMapper {

    Driver driverDtoToDriver(DriverDto driverDto);

    DriverDto driverToDriverDto(Driver driver);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", source = "id", ignore = true)
    Driver updateDriverFromDriverDto(DriverDto driverDto, @MappingTarget Driver driver);
}
