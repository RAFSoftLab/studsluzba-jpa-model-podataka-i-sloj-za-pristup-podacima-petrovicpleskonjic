package student_administration.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student_administration.models.Department;
import student_administration.models.HoldSubject;
import student_administration.models.ListenSubject;
import student_administration.models.Professor;
import student_administration.models.SchoolYear;
import student_administration.models.StudentIndex;
import student_administration.models.Subject;
import student_administration.repositories.HoldSubjectRepository;
import student_administration.repositories.ListenSubjectRepository;
import student_administration.repositories.ProfessorRepository;

@Service
public class HoldSubjectService {

	@Autowired
	HoldSubjectRepository holdSubjectRepo;
	
	@Autowired
	ListenSubjectRepository listenSubjectRepo;
	
	public HoldSubject saveHoldSubject(Professor professor, Subject subject, SchoolYear schoolYear){
		HoldSubject hs = new HoldSubject();
		hs.setProfessorOwner(professor);
		hs.setSubject(subject);
		hs.setSchoolYear(schoolYear);
		return holdSubjectRepo.save(hs);				
	}
	
	public List<HoldSubject> loadAll(){
		Iterable<HoldSubject> iter = holdSubjectRepo.findAll();
		List<HoldSubject> rez = new ArrayList<HoldSubject>();
		iter.forEach(rez :: add);
		return rez;
	}

	public ListenSubject saveListenSubject(HoldSubject holdSubject, StudentIndex value) {
		return listenSubjectRepo.save(new ListenSubject(value, holdSubject));
	}
}
