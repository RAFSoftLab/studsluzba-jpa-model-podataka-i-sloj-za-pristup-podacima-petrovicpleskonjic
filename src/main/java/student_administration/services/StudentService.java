package student_administration.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student_administration.models.EnrolledYear;
import student_administration.models.FirstEnroll;
import student_administration.models.RenewedYear;
import student_administration.models.SchoolYear;
import student_administration.models.Student;
import student_administration.models.StudentIndex;
import student_administration.repositories.EnrolledYearRepository;
import student_administration.repositories.FirstEnrollRepository;
import student_administration.repositories.RenewedYearRepository;
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
	
	@Autowired
	EnrolledYearRepository enrolledYearRepo;
	
	@Autowired
	RenewedYearRepository renewedYearRepo;
	
	public Student saveStudent(Student s) {
		return studentRepo.save(s);
	}
	
	public StudentIndex saveStudentIndeks(StudentIndex si) {
		return studentIndeksRepo.save(si);
	}
	
	public FirstEnroll saveFirstEnroll(FirstEnroll fe) {
		return firstEnrollRepo.save(fe);
	}

	public RenewedYear addRenewedYear(SchoolYear value,Student s) {
		RenewedYear ry = new RenewedYear();
		StudentIndex is = null;
		ry.setSchoolYear(value);
		ry.setNote("Obnova godine");
		ry.setDate(new Date());
		for(StudentIndex si : s.getStudentIndexes()) {
			if(si.isActive())
				is = si; 
		}
		ry.setStudentIndex(is);
		return renewedYearRepo.save(ry);
		
	}

	public EnrolledYear addEnrolledYear(SchoolYear value, Student s) {
		EnrolledYear ry = new EnrolledYear();
		StudentIndex is = null;
		ry.setSchoolYear(value);
		ry.setNote("Upis godine");
		ry.setDate(new Date());
		for(StudentIndex si : s.getStudentIndexes()) {
			if(si.isActive())
				is = si; 
		}
		ry.setStudentIndex(is);
		return enrolledYearRepo.save(ry);
	}
	
	public List<EnrolledYear> loadAllEnrolledYear(){
		Iterable<EnrolledYear> iter = enrolledYearRepo.findAll();
		List<EnrolledYear> rez = new ArrayList<EnrolledYear>();
		iter.forEach(rez :: add);
		return rez;
	}
	
	public List<RenewedYear> loadAllRenewedYear(){
		Iterable<RenewedYear> iter = renewedYearRepo.findAll();
		List<RenewedYear> rez = new ArrayList<RenewedYear>();
		iter.forEach(rez :: add);
		return rez;
	}
}
