package student_administration.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="examregistration")
@NamedQuery(name="ExamRegistration.findAll", query="SELECT er FROM ExamRegistration er")
public class ExamRegistration extends Activity {

	@ManyToOne(fetch = FetchType.LAZY)
	private ListenSubject listenSubject;
	
	@OneToOne(mappedBy = "examRegistration")
	private ExamTaking examTaking;

	public ExamRegistration(String note, StudentIndex index, ListenSubject listenSubject) {
		super(note, index);
		
		this.listenSubject = listenSubject;
	}

	public ListenSubject getListenSubject() {
		return listenSubject;
	}

	public void setListenSubject(ListenSubject listenSubject) {
		this.listenSubject = listenSubject;
	}
}
