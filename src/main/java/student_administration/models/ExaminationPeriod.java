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
@Table(name="examinationperiod")
@NamedQuery(name="ExaminationPeriod.findAll", query="SELECT ep FROM ExaminationPeriod ep")
public class ExaminationPeriod {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int examinationPeriodId;
	
	private String name;
	
	private Date startDate;
	
	private Date endDate;
	
	@OneToMany(mappedBy = "examinationPeriod")
	private List<Exam> exams;
	
	@ManyToOne
	private SchoolYear schoolYear;
	
	public ExaminationPeriod() {}

	public ExaminationPeriod(String name, Date startDate, Date endDate, List<Exam> exams) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.exams = exams;
	}

	public int getExaminationPeriodId() {
		return examinationPeriodId;
	}

	public void setExaminationPeriodId(int examinationPeriodId) {
		this.examinationPeriodId = examinationPeriodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public SchoolYear getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}

	
}
