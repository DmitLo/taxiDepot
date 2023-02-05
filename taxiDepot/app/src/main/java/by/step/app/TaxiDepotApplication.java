package by.step.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"by.step"})
@EntityScan(basePackages = {"by.step"})
@ComponentScan(basePackages = {"by.step"})
public class TaxiDepotApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxiDepotApplication.class, args);
    }
}
