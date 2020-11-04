package student_administration.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="studentindex")
@NamedQuery(name="StudentIndex.findAll", query="SELECT si FROM StudentIndex si")
public class StudentIndex {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentIndexId;
		
	private int number;
	
	private boolean active;
	
	@ManyToOne
	private Student student;

	@ManyToOne
	private Department department;
	
	@OneToMany(mappedBy = "studentIndex")
    private List<ListenSubject> listenSubjectList;
	
	@ManyToMany(mappedBy = "studentIndexes")
	private List<SchoolYear> schoolYears;
	
	@OneToMany(mappedBy = "studentIndex")
	private List<Activity> studentActivities;
	
	public StudentIndex() {}
	
	public StudentIndex(int number, boolean active, Student student, Department department) {
		super();
		this.number = number;
		this.active = active;
		this.student = student;
		this.department = department;
	}

	public int getStudentIndexId() {
		return studentIndexId;
	}

	public int getNumber() {
		return number;
	}

	public boolean isActive() {
		return active;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudentIndexId(int studentIndexId) {
		this.studentIndexId = studentIndexId;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setActive(boolean active) {
		this.active = active;
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
