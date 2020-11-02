package student_administration.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="examregistration")
@NamedQuery(name="ExamRegistration.findAll", query="SELECT er FROM ExamRegistration er")
public class ExamRegistration extends Activity{

	@ManyToOne(fetch = FetchType.LAZY)
	private ListenSubject listenSubject;
	
	private Date date;
	
	@OneToOne(mappedBy = "examRegistration")
	private ExamTaking examTaking;

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


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
