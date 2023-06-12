package com.api.api.repository;

import com.api.api.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.api.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
