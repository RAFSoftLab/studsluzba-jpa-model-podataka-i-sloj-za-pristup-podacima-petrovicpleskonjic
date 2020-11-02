package student_administration.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentindex")
@NamedQuery(name="StudentIndex.findAll", query="SELECT si FROM StudentIndex si")
public class StudentIndex {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentIndexId;
		
	private int broj;
	
	private boolean active;
	
	private Date activeDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="studentId")
	private Student student;

	@ManyToOne(fetch = FetchType.LAZY)
	private Department department;
	
	@OneToMany(mappedBy = "studentIndex")
    private List<ListenSubject> listenSubjectList;
	
	@ManyToMany(mappedBy = "studentIndexes")
	private List<SchoolYear> schoolYears;
	
	@OneToMany(mappedBy = "index")
	private List<Activity> studentActivities;
	
	@OneToOne(mappedBy = "newIndex")
	private ChangeDepartment changeDepartmentNew;
	
	@OneToOne(mappedBy = "oldIndex")
	private ChangeDepartment changeDepartmentOld;

	public StudentIndex(int broj, boolean active, Date activeDate, Student student, Department department) {
		super();
		this.broj = broj;
		this.active = active;
		this.activeDate = activeDate;
		this.student = student;
		this.department = department;
	}

	public int getStudentIndexId() {
		return studentIndexId;
	}

	public int getBroj() {
		return broj;
	}

	public boolean isActive() {
		return active;
	}

	public Date getActiveDate() {
		return activeDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudentIndexId(int studentIndexId) {
		this.studentIndexId = studentIndexId;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	
}
