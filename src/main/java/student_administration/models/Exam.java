package student_administration.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="exam")
@NamedQuery(name="Exam.findAll", query="SELECT e FROM Exam e")
public class Exam {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int examId;
	
	private Date examDate;
	
	private int hourExam;
	
	private boolean locked;
	
	@ManyToOne
	private HoldSubject holdSubject;
	
	@ManyToOne
	private ExaminationPeriod examinationPeriod;

	@ManyToOne
	private Professor professor;
	
	@OneToMany(mappedBy="exam")
	List<ExamRegistration> examRegistrations;
	
	@OneToMany(mappedBy="exam")
	List<PassedSubject> passedSubjects;
	
	public Exam() {}

	public Exam(Date examDate, int hourExam, boolean locked, HoldSubject holdSubject, ExaminationPeriod examinationPeriod,
			Professor professor) {
		super();
		this.examDate = examDate;
		this.hourExam = hourExam;
		this.locked = locked;
		this.holdSubject = holdSubject;
		this.examinationPeriod = examinationPeriod;
		this.professor = professor;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public int getHourExam() {
		return hourExam;
	}

	public void setHourExam(int hourExam) {
		this.hourExam = hourExam;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	public HoldSubject getHoldSubject() {
		return holdSubject;
	}
	
	public void setHoldSubject(HoldSubject holdSubject) {
		this.holdSubject = holdSubject;
	}

	public ExaminationPeriod getExaminationPeriod() {
		return examinationPeriod;
	}

	public void setExaminationPeriod(ExaminationPeriod examinationPeriod) {
		this.examinationPeriod = examinationPeriod;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
}
