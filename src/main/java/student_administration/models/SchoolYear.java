package student_administration.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="schoolyear")
@NamedQuery(name="SchoolYear.findAll", query="SELECT sy FROM SchoolYear sy")
public class SchoolYear {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int schoolyearId;
	
	private boolean active;
	
	@OneToMany(mappedBy = "schoolYear")
	private List<ExaminationPeriod> examinationPeriods;

	public SchoolYear(boolean active) {
		super();
		this.active = active;
	}

	public int getSchoolyearId() {
		return schoolyearId;
	}

	public void setSchoolyearId(int schoolyearId) {
		this.schoolyearId = schoolyearId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<ExaminationPeriod> getExaminationPeriods() {
		return examinationPeriods;
	}

	public void setExaminationPeriods(List<ExaminationPeriod> examinationPeriods) {
		this.examinationPeriods = examinationPeriods;
	}
	
	
}
