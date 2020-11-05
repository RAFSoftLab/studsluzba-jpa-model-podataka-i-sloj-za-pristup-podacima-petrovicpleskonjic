package student_administration.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passedsubject")
@NamedQuery(name="PassedSubject.findAll", query="SELECT ps FROM PassedSubject ps")
public class PassedSubject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passedSubjectId;
	
	@OneToOne
	private ListenSubject listenSubject;
	
	@ManyToOne
	private Exam exam;
		
	private boolean fromOtherCollege;
	
	private int grade;
	
	public PassedSubject() {}

	public PassedSubject(ListenSubject listenSubject, Exam exam, boolean fromOtherCollege, int grade) {
		super();
		this.listenSubject = listenSubject;
		this.exam = exam;
		this.fromOtherCollege = fromOtherCollege;
		this.grade = grade;
	}

	public boolean isFromOtherCollege() {
		return fromOtherCollege;
	}

	public void setFromOtherCollege(boolean fromOtherCollege) {
		this.fromOtherCollege = fromOtherCollege;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PassedSubject [listenSubject=" + listenSubject + ", grade=" + grade + "]";
	}
}
