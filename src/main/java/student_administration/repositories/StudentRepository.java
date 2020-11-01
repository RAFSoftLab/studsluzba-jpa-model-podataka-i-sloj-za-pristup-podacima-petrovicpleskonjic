package student_administration.repositories;

import org.springframework.data.repository.CrudRepository;

import student_administration.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {}
