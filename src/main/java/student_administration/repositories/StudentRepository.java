package student_administration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import student_administration.models.Student;
import student_administration.models.PassedSubject;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	@Query("SELECT s FROM Student s WHERE s.studentId = "
			+ "(SELECT index.student.studentId FROM StudentIndex index WHERE index.number = :indexNumber)")
	Student getStudentByIndexNumber(int indexNumber);
	
    @Query("SELECT ps FROM PassedSubject ps WHERE ps.passedSubjectId = "
    		+ "(SELECT ls.passedSubject.passedSubjectId from ListenSubject ls WHERE ls.studentIndex.studentIndexId = "
    		+ "(SELECT index.studentIndexId FROM StudentIndex index WHERE index.number = :indexNumber))")
    List<PassedSubject> getPassedSubjectsByIndex(int indexNumber);
}
