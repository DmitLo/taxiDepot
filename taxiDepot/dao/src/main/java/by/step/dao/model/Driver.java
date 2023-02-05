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
@Entity(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contract_id")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    private String name;
    private String lastName;

}
