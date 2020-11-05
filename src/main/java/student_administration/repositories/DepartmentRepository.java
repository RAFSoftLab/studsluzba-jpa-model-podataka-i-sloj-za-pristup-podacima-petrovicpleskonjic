package student_administration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import student_administration.models.Department;
import student_administration.models.Subject;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
	
	@Query("SELECT su FROM Subject su WHERE su.department = "
			+ "(SELECT department.subjects FROM Department department WHERE department.departmentId = :departmentId)")
	List<Subject> getSubjectByDepartmentId(int departmentId);
}
