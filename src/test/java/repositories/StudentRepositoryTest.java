package repositories;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import student_administration.models.Department;
import student_administration.models.FirstEnroll;
import student_administration.models.HighSchool;
import student_administration.models.HoldSubject;
import student_administration.models.ListenSubject;
import student_administration.models.Student;
import student_administration.models.StudentIndex;
import student_administration.models.Subject;
import student_administration.models.PassedSubject;
import student_administration.repositories.DepartmentRepository;
import student_administration.repositories.FirstEnrollRepository;
import student_administration.repositories.HighSchoolRepository;
import student_administration.repositories.HoldSubjectRepository;
import student_administration.repositories.ListenSubjectRepository;
import student_administration.repositories.PassedSubjectRepository;
import student_administration.repositories.StudentIndexRepository;
import student_administration.repositories.StudentRepository;
import student_administration.repositories.SubjectRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= {student_administration.StudentAdministrationApp.class})
public class StudentRepositoryTest {
	
	@Autowired
	HighSchoolRepository highSchoolRepository;

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	HoldSubjectRepository holdSubjectRepository;
	
	@Autowired
	ListenSubjectRepository listenSubjectRepository;
	
	@Autowired
	PassedSubjectRepository passedSubjectRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	StudentIndexRepository studentIndexRepository;
	
	@Autowired
	FirstEnrollRepository firstEnrollRepository;
	
	private static boolean setupIsDone = false;
	
	@Before
	public void setupData() {
		if (setupIsDone)
			return;
		
		HighSchool highSchool = new HighSchool("Test Srednja Skola", "Beograd", "Gimnazija");
		highSchoolRepository.save(highSchool);
		
		Student student = new Student();
		student.setName("Student");
		student.setSurname("Studentic");
		student.setEnrollementYear(2020);
		studentRepository.save(student);
		
		Department department = new Department();
		department.setName("Nauke");
		department.setShortName("RN");
		departmentRepository.save(department);
		
		StudentIndex index = new StudentIndex(3318, true, student, department);
		studentIndexRepository.save(index);
		
		FirstEnroll firstEnroll = new FirstEnroll("Prvi upis", index, 40, 60, highSchool);
		firstEnrollRepository.save(firstEnroll);
		
		Subject subject = new Subject();
		subject.setName("UPINF");
		subject.setDepartment(department);
		subjectRepository.save(subject);
		
		HoldSubject holdSubject = new HoldSubject(null, subject, null);
		holdSubjectRepository.save(holdSubject);
		
		ListenSubject listenSubject = new ListenSubject(index, holdSubject);
		listenSubjectRepository.save(listenSubject);
		
		PassedSubject passedSubject = new PassedSubject(listenSubject, false, 10);
		passedSubjectRepository.save(passedSubject);	
		
		// To run the setup only once, else it'd be called on every test method call
		setupIsDone = true;
	}
	
	@Test
	public void getStudentByIndex() throws Exception {
		Student student = studentRepository.getStudentByIndexNumber(3318);
		System.out.println(student);
	}
	
	@Test
	public void getPassedExamsByIndex() throws Exception {
		List<PassedSubject> passedSubjects = studentRepository.getPassedSubjectsByIndex(3318);
		
		for (PassedSubject ps : passedSubjects)
			System.out.println(ps);
	}
}
