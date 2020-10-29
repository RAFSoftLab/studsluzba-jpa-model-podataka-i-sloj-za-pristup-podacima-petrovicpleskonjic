package student_administration.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="activity")
@NamedQuery(name="Activity.findAll", query="SELECT act FROM Activity act")
public class Activity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int activityId;
}
