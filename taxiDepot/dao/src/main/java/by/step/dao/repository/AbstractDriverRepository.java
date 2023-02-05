package by.step.dao.repository;

import by.step.dao.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractDriverRepository extends JpaRepository<Driver, Long> {
}
