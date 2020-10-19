package student_administration.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the studProgram database table.
 * 
 */
@Entity
@Table(name="department")
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private String shortName;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="department")
	private List<Student> students;
	
//	@OneToMany(mappedBy="department")
//	private List<Predmet> predmets;

	public Department() {}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setDepartment(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setDepartment(null);

		return student;
	}
	

}