package student_administration.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Table(name="student")
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int enrollementYear;

	private String name;

	private String surname;
	
	//bi-directional many-to-one association to StudProgram
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name="id")
	private Department department;
	

	public Student() {}
	

	public Student(int enrollementYear, String name, String surname, Department department) {
		super();
		this.enrollementYear = enrollementYear;
		this.name = name;
		this.surname = surname;
		this.department = department;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getEnrollementYear() {
		return enrollementYear;
	}


	public void setEnrollementYear(int enrollementYear) {
		this.enrollementYear = enrollementYear;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}

}