package student_administration.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="PassedSubject")
@NamedQuery(name="PassedSubject.findAll", query="SELECT ps FROM PassedSubject ps")
public class PassedSubject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passedSubjectId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private ListenSubject listenSubject;
		
	private boolean fromOtherCollege;
	
	private int grade;

	public PassedSubject(ListenSubject listenSubject, boolean fromOtherCollege, int grade) {
		super();
		this.listenSubject = listenSubject;
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
	
	
}