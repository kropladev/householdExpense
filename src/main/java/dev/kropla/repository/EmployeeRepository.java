package dev.kropla.repository;

/**
 * Created by kropla on 05.07.16.
 */

import dev.kropla.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}