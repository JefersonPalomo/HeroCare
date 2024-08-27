package com.one.hc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.hc.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
