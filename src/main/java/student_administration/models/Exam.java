package student_administration.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="exam")
@NamedQuery(name="Exam.findAll", query="SELECT e FROM Exam e")
public class Exam{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int examId;
	
	private Date examDate;
	
	private int hourExam;	//kako predstaviti vreme ispita???
	
	private boolean locked;
	
	@ManyToOne
	private Subject subject;
	
	@ManyToOne
	private ExaminationPeriod examinationPeriod;

	@ManyToOne
	private Professor professor;
	
	public Exam() {}

	public Exam(Date examDate, int hourExam, boolean locked, Subject subject, ExaminationPeriod examinationPeriod,
			Professor professor) {
		super();
		this.examDate = examDate;
		this.hourExam = hourExam;
		this.locked = locked;
		this.subject = subject;
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
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
