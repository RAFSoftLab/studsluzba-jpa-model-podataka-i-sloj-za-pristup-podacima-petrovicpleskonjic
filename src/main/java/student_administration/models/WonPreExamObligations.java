package student_administration.models;

public class WonPreExamObligations {

	private StudentIndex studentIndex;
	
	private float points;
	
	private PreExamObligations preExamObligations;

	public WonPreExamObligations(StudentIndex studentIndex, float points, PreExamObligations preExamObligations) {
		super();
		this.studentIndex = studentIndex;
		this.points = points;
		this.preExamObligations = preExamObligations;
	}

	public StudentIndex getStudentIndex() {
		return studentIndex;
	}

	public void setStudentIndex(StudentIndex studentIndex) {
		this.studentIndex = studentIndex;
	}

	public float getPoints() {
		return points;
	}

	public void setPoints(float points) {
		this.points = points;
	}

	public PreExamObligations getPreExamObligations() {
		return preExamObligations;
	}

	public void setPreExamObligations(PreExamObligations preExamObligations) {
		this.preExamObligations = preExamObligations;
	}
	
	
}
