package by.step.dao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Double price;

    private Double fuelConsumption;

    private Double speed;

    @OneToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    private String numberBoard;

}
