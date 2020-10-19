package student_administration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class StudentAdministrationApp {

	public static void main(String[] args) {
		SpringApplication.run(StudentAdministrationApp.class, args);

	}

}
