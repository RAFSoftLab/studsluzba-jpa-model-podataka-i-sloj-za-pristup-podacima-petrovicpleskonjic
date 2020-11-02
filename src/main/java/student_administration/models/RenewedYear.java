package student_administration.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="renewedyear")
@NamedQuery(name="RenewedYear.findAll", query="SELECT ry FROM RenewedYear ry")
public class RenewedYear extends Activity{

	private int renewedYear;
	
	@OneToMany(mappedBy = "renewedYear")
	private List<Subject> renewedSubjects;

	public RenewedYear(int renewedYear, List<Subject> renewedSubjects) {
		super();
		this.renewedYear = renewedYear;
		this.renewedSubjects = renewedSubjects;
	}

	public int getRenewedYear() {
		return renewedYear;
	}

	public void setRenewedYear(int renewedYear) {
		this.renewedYear = renewedYear;
	}

	public List<Subject> getRenewedSubjects() {
		return renewedSubjects;
	}

	public void setRenewedSubjects(List<Subject> renewedSubjects) {
		this.renewedSubjects = renewedSubjects;
	}
	
	
}
