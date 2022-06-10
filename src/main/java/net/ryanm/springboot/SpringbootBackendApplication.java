package net.ryanm.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.ryanm.springboot.entity.Account;
import net.ryanm.springboot.entity.Employee;
import net.ryanm.springboot.repository.AccountRepository;
import net.ryanm.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder()
			.firstName("Ryan")
			.lastName("Mera")
			.email("ryanm@com.com")
			.build();

			Employee employee2= Employee.builder()
			.firstName("Ryan2")
			.lastName("Mera2")
			.email("ryanm2@com.com")
			.build();

			Account account1 = Account.builder()
			.name("Ryan")
			.picture("test")
			.email("ryanm@com.com")
			.build();

			Account account2= Account.builder()
			.name("Ryan2")
			.picture("test")
			.email("ryanm2@com.com")
			.build();

		accountRepository.save(account1);
		accountRepository.save(account2);

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}


}
