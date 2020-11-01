package student_administration.repositories;

import org.springframework.data.repository.CrudRepository;

import student_administration.models.Exam;

public interface ExamRepository extends CrudRepository<Exam, Integer> {}
