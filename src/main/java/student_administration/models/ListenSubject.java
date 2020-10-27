package student_administration.models;

public class ListenSubject {

	private StudentIndex student;
	
	private HoldSubject holdSubject;

	public ListenSubject(StudentIndex student, HoldSubject holdSubject) {
		super();
		this.student = student;
		this.holdSubject = holdSubject;
	}

	public StudentIndex getStudent() {
		return student;
	}

	public void setStudent(StudentIndex student) {
		this.student = student;
	}

	public HoldSubject getHoldSubject() {
		return holdSubject;
	}

	public void setHoldSubject(HoldSubject holdSubject) {
		this.holdSubject = holdSubject;
	}
	
	
	
	
}
