package student_administration.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student_administration.models.Exam;
import student_administration.repositories.ExamRepository;

@Service
public class ExamService {
	
	@Autowired
	ExamRepository examRepo;
	
	
	public Exam saveExam(Exam e) {
		return examRepo.save(e);
	}
	
	public List<Exam> loadAll(){
		Iterable<Exam> iter = examRepo.findAll();
		List<Exam> rez = new ArrayList<Exam>();
		iter.forEach(rez :: add);
		return rez;
	}
	
	public List<Exam> loadAllExamOnExaminationPeriod(int examinationPeriodId){
		Iterable<Exam> iter = examRepo.getExamsForExaminationPeriod(examinationPeriodId);
		List<Exam> rez = new ArrayList<Exam>();
		iter.forEach(rez :: add);
		return rez;
	}
}
