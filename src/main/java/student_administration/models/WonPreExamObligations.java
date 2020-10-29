package student_administration.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="wonpreexamobligations")
@NamedQuery(name="WonPreExamObligations.findAll", query="SELECT wpeo FROM WonPreExamObligations wpeo")
public class WonPreExamObligations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wonPreExamObligationsId;

	@ManyToOne(fetch = FetchType.LAZY)
	private ListenSubject listenSubject;
		
	private float points;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private PreExamObligations preExamObligations;

	public WonPreExamObligations(StudentIndex studentIndex, float points, PreExamObligations preExamObligations) {
		super();
		this.points = points;
		this.preExamObligations = preExamObligations;
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
