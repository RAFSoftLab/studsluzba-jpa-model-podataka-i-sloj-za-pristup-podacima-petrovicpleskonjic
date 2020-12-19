package student_administration.client.fxmlcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import student_administration.client.MainViewManager;
import student_administration.models.Exam;
import student_administration.models.ExamRegistration;
import student_administration.services.DepartmentService;

@Component
public class ExamRegisterController {
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	MainViewManager mainViewManager;
	
	private Exam e;
	
	private ObservableList<ExamRegistration> allRegistrations;
	
	@FXML private TableView<ExamRegistration> studentOnExamTable;
	
	
	
	@FXML
	public void initialize() {
		e = (Exam) mainViewManager.getData().get("exam");
		
		allRegistrations = FXCollections.observableList(e.getExamRegistrations());
		studentOnExamTable.setItems(allRegistrations);
	}
}