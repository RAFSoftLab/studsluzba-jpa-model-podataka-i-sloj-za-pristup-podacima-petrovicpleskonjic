package student_administration.repositories;

import org.springframework.data.repository.CrudRepository;

import student_administration.models.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Integer> {}
