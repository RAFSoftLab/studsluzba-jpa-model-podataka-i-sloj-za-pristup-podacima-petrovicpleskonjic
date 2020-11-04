package student_administration.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="holdsubject")
@NamedQuery(name="HoldSubject.findAll", query="SELECT hs FROM HoldSubject hs")
public class HoldSubject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int holdSubjectId;

	@ManyToOne
	private Professor professor;
	
	@ManyToOne
	private Subject subject;
	
	@ManyToOne
	private SchoolYear schoolYear;
	
	@OneToMany(mappedBy = "holdSubject")
    private List<ListenSubject> listenSubjectList;
	
	@OneToMany(mappedBy = "holdSubject")
	private List<PreExamObligations> preExamObligations;
	
	public HoldSubject() {}

	public HoldSubject(Professor professor, Subject subject, SchoolYear schoolYear) {
		super();
		this.professor = professor;
		this.subject = subject;
		this.schoolYear = schoolYear;
	}
	
	public int getHoldSubjectId() {
		return holdSubjectId;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public SchoolYear getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}

	@Override
	public String toString() {
		return "HoldSubject [professor=" + professor + ", subject=" + subject + ", schoolYear=" + schoolYear + "]";
	}
}
