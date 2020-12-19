package student_administration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student_administration.models.FirstEnroll;
import student_administration.models.Student;
import student_administration.models.StudentIndex;
import student_administration.repositories.FirstEnrollRepository;
import student_administration.repositories.StudentIndexRepository;
import student_administration.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepo;
	
	@Autowired
	StudentIndexRepository studentIndeksRepo;
	
	@Autowired
	FirstEnrollRepository firstEnrollRepo;
	
	public Student saveStudent(Student s) {
		return studentRepo.save(s);
	}
	
	public StudentIndex saveStudentIndeks(StudentIndex si) {
		return studentIndeksRepo.save(si);
	}
	
	public FirstEnroll saveFirstEnroll(FirstEnroll fe) {
		return firstEnrollRepo.save(fe);
	}
}
