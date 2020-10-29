package student_administration.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="professor")
@NamedQuery(name="Professor.findAll", query="SELECT p FROM Professor p")
public class Professor{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int professorId;
	
	private String name;
	
	private String surname;
	
	private String middlename;
	
	private String email;
	
	@OneToMany(mappedBy = "professor")
    private List<HoldSubject> holdSubjectList;
	
	@OneToMany(mappedBy = "professor")
	private List<TitleOfProfessor> titles;
	
	@OneToMany(mappedBy = "professor")
	private List<Exam> exams;
	
	@ManyToMany()
	private List<College> colleges;

	public Professor(String name, String surname, String middlename, String email,
			List<TitleOfProfessor> titles) {
		super();
		this.name = name;
		this.surname = surname;
		this.middlename = middlename;
		this.email = email;
		this.titles = titles;
	}
	
	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
	
	public List<College> getColleges() {
		return colleges;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
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

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<TitleOfProfessor> getTitles() {
		return titles;
	}

	public void setTitles(List<TitleOfProfessor> titles) {
		this.titles = titles;
	}
	
	

}