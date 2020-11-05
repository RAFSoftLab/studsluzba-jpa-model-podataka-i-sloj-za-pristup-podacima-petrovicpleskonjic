package student_administration.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="enrolledyear")
@NamedQuery(name="EnrolledYear.findAll", query="SELECT ey FROM EnrolledYear ey")
public class EnrolledYear extends Activity {

	@ManyToOne
	private SchoolYear schoolYear;
	
	@OneToMany(mappedBy = "enrolledYear")
	private List<ListenSubject> transferedSubjects;
	
	public EnrolledYear() {}

	public EnrolledYear(String note, StudentIndex index, SchoolYear schoolYear, List<ListenSubject> transferedSubjects) {
		super(note, index);
		
		this.schoolYear = schoolYear;
		this.transferedSubjects = transferedSubjects;
	}

	public SchoolYear getEnrolledYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}

	public List<ListenSubject> getTransferedSubjects() {
		return transferedSubjects;
	}

	public void setTransferedSubjects(List<ListenSubject> transferedSubjects) {
		this.transferedSubjects = transferedSubjects;
	}

	@Override
	public String toString() {
		return "EnrolledYear [schoolYear=" + schoolYear + "]";
	}
}
