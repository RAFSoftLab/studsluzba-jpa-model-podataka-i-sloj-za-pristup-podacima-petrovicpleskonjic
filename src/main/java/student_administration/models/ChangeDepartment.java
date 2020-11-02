package student_administration.models;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="changedepartment")
@NamedQuery(name="ChangeDepartment.findAll", query="SELECT cd FROM ChangeDepartment cd")
public class ChangeDepartment extends Activity{

	@OneToOne
	private StudentIndex newIndex;
	
	@OneToOne
	private StudentIndex oldIndex;

	public ChangeDepartment(StudentIndex newIndex, StudentIndex oldIndex) {
		super();
		this.newIndex = newIndex;
		this.oldIndex = oldIndex;
	}

	public StudentIndex getNewIndex() {
		return newIndex;
	}

	public void setNewIndex(StudentIndex newIndex) {
		this.newIndex = newIndex;
	}

	public StudentIndex getOldIndex() {
		return oldIndex;
	}

	public void setOldIndex(StudentIndex oldIndex) {
		this.oldIndex = oldIndex;
	}
	
	
}
