package student_administration.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="studentindex")
@NamedQuery(name="StudentIndex.findAll", query="SELECT si FROM StudentIndex si")
public class StudentIndex{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentIndexId;
	
	private int godina;
	
	private int broj;
	
	private boolean active;
	
	private Date activeDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="studentId")
	private Student student;

	@ManyToOne(fetch = FetchType.LAZY)
	private Department department;

	public StudentIndex(int godina, int broj, boolean active, Date activeDate, Student student, Department department) {
		super();
		this.godina = godina;
		this.broj = broj;
		this.active = active;
		this.activeDate = activeDate;
		this.student = student;
		this.department = department;
	}

	public int getStudentIndexId() {
		return studentIndexId;
	}

	public int getGodina() {
		return godina;
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

	public void setGodina(int godina) {
		this.godina = godina;
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
