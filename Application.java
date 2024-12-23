package in.Ramesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ramesh.entity.Student;
import in.Ramesh.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
	//	System.out.println(studentRepository.getClass().getName());
		
		Student entity = new Student();
		entity.setId(1);
		entity.setName("Ramesh Paswan");
		entity.setGender("Male");
		entity.setRank(59);
		studentRepository.save(entity);
		System.out.println("Record Inserted.....");
	}

}
