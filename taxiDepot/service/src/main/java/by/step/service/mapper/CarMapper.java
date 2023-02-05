package by.step.service.mapper;

import by.step.dao.model.Car;
import by.step.service.dto.CarDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CarMapper {

    Car carDtoToCar(CarDto carDto);

    CarDto carToCarDto(Car car);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", source = "id", ignore = true)
    Car updateCarFromCarDto(CarDto carDto, @MappingTarget Car car);
}
