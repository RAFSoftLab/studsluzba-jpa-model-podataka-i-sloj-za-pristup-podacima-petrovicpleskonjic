package student_administration.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="examregistration")
@NamedQuery(name="ExamRegistration.findAll", query="SELECT er FROM ExamRegistration er")
public class ExamRegistration {
	
	@Id // Izbaciti jer ce se uzimati iz aktivnosti !
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int examRegistrationId;

	@ManyToOne(fetch = FetchType.LAZY)
	private ListenSubject listenSubject;
	
	private Date date;

	public ExamRegistration(ListenSubject listenSubject, Date date) {
		this.listenSubject = listenSubject;
		this.date = date;
	}

	public ListenSubject getListenSubject() {
		return listenSubject;
	}

	public void setListenSubject(ListenSubject listenSubject) {
		this.listenSubject = listenSubject;
	}

	public int getExamRegistrationId() {
		return examRegistrationId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
