package student_administration.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="activity")
@NamedQuery(name="Activity.findAll", query="SELECT act FROM Activity act")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Activity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int activityId;
	
	protected String note;
	
	@CreatedDate
	protected Date date;
	
	@ManyToOne
	protected StudentIndex studentIndex;

	public Activity(String note, StudentIndex studentIndex) {
		this.note = note;
		this.studentIndex = studentIndex;
	}
}
