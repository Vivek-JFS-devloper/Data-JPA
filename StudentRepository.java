package in.Ramesh.repository;

import org.springframework.data.repository.CrudRepository;

import in.Ramesh.entity.Student;


public interface StudentRepository extends CrudRepository<Student, Integer>{
	
}
