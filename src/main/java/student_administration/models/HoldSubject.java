package student_administration.models;

public class HoldSubject {

	private Professor professor;
	
	private Subject subject;
	
	private SchoolYear schoolYear;

	public HoldSubject(Professor professor, Subject subject, SchoolYear schoolYear) {
		super();
		this.professor = professor;
		this.subject = subject;
		this.schoolYear = schoolYear;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public SchoolYear getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}
	
	
}
