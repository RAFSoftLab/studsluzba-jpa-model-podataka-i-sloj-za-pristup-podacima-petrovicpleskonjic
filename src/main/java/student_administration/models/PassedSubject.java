package student_administration.models;

public class PassedSubject {

	private HoldSubject holdSubject;
	
	private boolean admitt;
	
	private int ocena;

	public PassedSubject(HoldSubject holdSubject, boolean admitt, int ocena) {
		super();
		this.holdSubject = holdSubject;
		this.admitt = admitt;
		this.ocena = ocena;
	}

	public HoldSubject getHoldSubject() {
		return holdSubject;
	}

	public void setHoldSubject(HoldSubject holdSubject) {
		this.holdSubject = holdSubject;
	}

	public boolean isAdmitt() {
		return admitt;
	}

	public void setAdmitt(boolean admitt) {
		this.admitt = admitt;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	
}
