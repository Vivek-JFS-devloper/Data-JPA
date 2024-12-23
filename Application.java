package in.Ramesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ramesh.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		System.out.println(studentRepository.getClass().getName());
		/*
		 *insert Records
		 * Student entity = new Student(); entity.setId(1);
		 * entity.setName("Ramesh Paswan"); entity.setGender("Male");
		 * entity.setRank(59); studentRepository.save(entity);
		 * System.out.println("Record Inserted.....");
		 */
		
		//Retrive Records single entity.
		
		/*
		 * Optional<Student> id = studentRepository.findById(1);
		 * 
		 * if(id.isPresent()) { Student student = id.get(); List<Student> list =
		 * List.of(student); for(Student s : list) { System.out.println(s); 
		 * } }
		 */
		
		// Retrive Records All Entity
		/*
		 * Iterable<Student> all = studentRepository.findAll();
		 * studentRepository.findAll().forEach(a->System.out.println(a));
		 * System.out.println("OR===========");
		 * all.forEach(entity->System.out.println(entity));
		 */
		
		//delete Recode by id;
		/*
		 * if(studentRepository.existsById(10)) { studentRepository.deleteById(10);
		 * System.out.println("Record Deleted..."); }else {
		 * System.out.println("No Records Present.."); }
		 */
		//how many Record available 
		long count = studentRepository.count();
		System.out.println(count);
	}

}
