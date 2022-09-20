package javaproject.springbootbackend;

import javaproject.springbootbackend.model.Employee;
import javaproject.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Employee employee = new Employee();
		employee.setFirstName("Maggie");
		employee.setLastName("Xu");
		employee.setEmailId("maggie@gmai.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Charlotte");
		employee1.setLastName("Yang");
		employee1.setEmailId("charlottee@gmai.com");
		employeeRepository.save(employee1);

		 */
	}
}
