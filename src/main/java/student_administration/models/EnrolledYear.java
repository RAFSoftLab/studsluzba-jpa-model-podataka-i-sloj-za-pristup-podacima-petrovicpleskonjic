package student_administration.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="enrolledyear")
@NamedQuery(name="EnrolledYear.findAll", query="SELECT ey FROM EnrolledYear ey")
public class EnrolledYear extends Activity{

	private int enrolledYear;
	
	@OneToMany(mappedBy = "enrolledYear")
	private List<Subject> enrolledSubjects;

	public EnrolledYear(int enrolledYear, List<Subject> enrolledSubjects) {
		super();
		this.enrolledYear = enrolledYear;
		this.enrolledSubjects = enrolledSubjects;
	}

	public int getEnrolledYear() {
		return enrolledYear;
	}

	public void setEnrolledYear(int enrolledYear) {
		this.enrolledYear = enrolledYear;
	}

	public List<Subject> getEnrolledSubjects() {
		return enrolledSubjects;
	}

	public void setEnrolledSubjects(List<Subject> enrolledSubjects) {
		this.enrolledSubjects = enrolledSubjects;
	}
	
	
}
