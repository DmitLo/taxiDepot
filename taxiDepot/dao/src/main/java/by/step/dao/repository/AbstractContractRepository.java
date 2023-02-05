package by.step.dao.repository;

import by.step.dao.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractContractRepository extends JpaRepository<Contract, Long> {
}
