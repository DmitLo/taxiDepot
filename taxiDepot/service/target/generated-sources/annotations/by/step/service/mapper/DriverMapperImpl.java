package by.step.service.mapper;

import by.step.dao.model.Driver;
import by.step.service.dto.DriverDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-05T17:00:07+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.17 (BellSoft)"
)
@Component
public class DriverMapperImpl implements DriverMapper {

    @Override
    public Driver driverDtoToDriver(DriverDto driverDto) {
        if ( driverDto == null ) {
            return null;
        }

        Driver driver = new Driver();

        driver.setId( driverDto.getId() );
        driver.setName( driverDto.getName() );
        driver.setLastName( driverDto.getLastName() );

        return driver;
    }

    @Override
    public DriverDto driverToDriverDto(Driver driver) {
        if ( driver == null ) {
            return null;
        }

        DriverDto driverDto = new DriverDto();

        driverDto.setId( driver.getId() );
        driverDto.setName( driver.getName() );
        driverDto.setLastName( driver.getLastName() );

        return driverDto;
    }

    @Override
    public Driver updateDriverFromDriverDto(DriverDto driverDto, Driver driver) {
        if ( driverDto == null ) {
            return driver;
        }

        if ( driverDto.getName() != null ) {
            driver.setName( driverDto.getName() );
        }
        if ( driverDto.getLastName() != null ) {
            driver.setLastName( driverDto.getLastName() );
        }

        return driver;
    }
}
