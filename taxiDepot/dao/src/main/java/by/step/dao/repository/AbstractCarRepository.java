package by.step.dao.repository;

import by.step.dao.model.Car;
import by.step.dao.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AbstractCarRepository extends JpaRepository<Car, Long> {
    @Transactional
    @Modifying
    @Query("update cars c set c.price = ?1, c.fuelConsumption = ?2, c.speed = ?3, c.driver = ?4, c.numberBoard = ?5 " +
            "where c.id = ?6")
    void updatePriceAndFuelConsumptionAndSpeedAndDriverAndNumberBoardById(Double price, Double fuelConsumption, Double speed, Driver driver, String numberBoard, Long id);

    List<Car> findBySpeedAndFuelConsumption(Double speed, Double fuelConsumption);

}
