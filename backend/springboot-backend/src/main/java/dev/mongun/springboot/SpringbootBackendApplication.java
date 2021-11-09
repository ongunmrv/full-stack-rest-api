package dev.mongun.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.mongun.springboot.entitiy.Employee;
import dev.mongun.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee1 = Employee.builder()
				.firstName("Mary")
				.lastName("Public")
				.email("mary@gmail.com")
				.build();
		
		Employee employee2 = Employee.builder()
				.firstName("John")
				.lastName("Doe")
				.email("john@gmail.com")
				.build();
		
		Employee employee3 = Employee.builder()
				.firstName("Larry")
				.lastName("King")
				.email("larry@gmail.com")
				.build();
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}

}
