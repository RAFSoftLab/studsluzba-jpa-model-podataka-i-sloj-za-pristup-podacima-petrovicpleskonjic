package student_administration.repositories;

import org.springframework.data.repository.CrudRepository;

import student_administration.models.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Integer> {}
