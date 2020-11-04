package student_administration.repositories;

import org.springframework.data.repository.CrudRepository;

import student_administration.models.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {}
