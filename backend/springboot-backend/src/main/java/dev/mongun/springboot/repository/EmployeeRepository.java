package dev.mongun.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mongun.springboot.entitiy.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
