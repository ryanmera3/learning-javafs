package net.ryanm.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import net.ryanm.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  
}
