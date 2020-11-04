package student_administration.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="college")
@NamedQuery(name="College.findAll", query="SELECT c FROM College c")
public class College {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int collegeId;
	
	private String name;
	
	private String place;
	
	private String type;
	
	@ManyToMany(mappedBy = "colleges")
	private List<Professor> professors;
	
	public College() {}
		
	public College(String name, String place, String type) {
		super();
		this.name = name;
		this.place = place;
		this.type = type;
	}
	
	public List<Professor> getProfessors() {
		return professors;
	}
	
	public void setProfessors(List<Professor> professors) {
		this.professors = professors;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
