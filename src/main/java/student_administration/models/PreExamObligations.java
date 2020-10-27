package student_administration.models;

public class PreExamObligations {
	
	private Subject subject;

	private String type;	//test,kolokvijum,projekat...
	
	private float maxPoints;
	
	private SchoolYear schoolYear;

	public PreExamObligations(Subject subject, String type, float maxPoints, SchoolYear schoolYear) {
		super();
		this.subject = subject;
		this.type = type;
		this.maxPoints = maxPoints;
		this.schoolYear = schoolYear;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getMaxPoints() {
		return maxPoints;
	}

	public void setMaxPoints(float maxPoints) {
		this.maxPoints = maxPoints;
	}

	public SchoolYear getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}
	
	
}
