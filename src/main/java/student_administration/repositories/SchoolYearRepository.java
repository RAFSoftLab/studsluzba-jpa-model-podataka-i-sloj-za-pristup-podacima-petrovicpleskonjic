package student_administration.repositories;

import org.springframework.data.repository.CrudRepository;

import student_administration.models.SchoolYear;

public interface SchoolYearRepository extends CrudRepository<SchoolYear, Integer> {}
