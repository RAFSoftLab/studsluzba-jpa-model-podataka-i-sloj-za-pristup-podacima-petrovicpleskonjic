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
@Table(name="listensubject")
@NamedQuery(name="ListenSubject.findAll", query="SELECT ls FROM ListenSubject ls")
public class ListenSubject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int listenSubjectId;

	@ManyToOne(fetch = FetchType.LAZY)
	private StudentIndex studentIndex;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private HoldSubject holdSubject;
	
	@OneToMany(mappedBy = "listenSubject")
    private List<WonPreExamObligations> wonPreExamObligations;
	
	@OneToMany(mappedBy = "listenSubject")
	private List<PassedSubject> passedSubjects;
	
	@OneToMany(mappedBy = "listenSubject")
	private List<ExamRegistration> examRegistrations;

	public ListenSubject(StudentIndex studentIndex, HoldSubject holdSubject) {
		super();
		this.studentIndex = studentIndex;
		this.holdSubject = holdSubject;
	}
	
	public int getListenSubjectId() {
		return listenSubjectId;
	}

	public StudentIndex getStudentIndex() {
		return studentIndex;
	}

	public void setStudentIndex(StudentIndex studentIndex) {
		this.studentIndex = studentIndex;
	}

	public HoldSubject getHoldSubject() {
		return holdSubject;
	}

	public void setHoldSubject(HoldSubject holdSubject) {
		this.holdSubject = holdSubject;
	}
	
	
	
	
}