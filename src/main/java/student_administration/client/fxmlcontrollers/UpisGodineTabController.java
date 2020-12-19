package student_administration.client.fxmlcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import student_administration.client.MainViewManager;
import student_administration.models.AcademicTitle;
import student_administration.models.SchoolYear;
import student_administration.models.TitleOfProfessor;
import student_administration.services.SchoolYearService;

@Component
public class UpisGodineTabController {

	@Autowired
	MainViewManager mainViewManager;
	
	@FXML private ComboBox<SchoolYear> godinaCb;
	
	@Autowired
	SchoolYearService schoolYearService;
	
	private ObservableList<SchoolYear> allSchoolYears;
	
	@FXML private TableView<SchoolYear> godinaUpisaTable;
	
	
	@FXML
	public void initialize() {
		List<SchoolYear> years = schoolYearService.loadAll();
		godinaCb.setItems(FXCollections.observableArrayList(years));		//da li da ovde prikazuje samo aktivnu godinu ili kao sada sve
		
		godinaUpisaTable.setOnMousePressed(new EventHandler<MouseEvent>() {
		    @Override 
		    public void handle(MouseEvent event) {
		        if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
		        	mainViewManager.getData().put("godinaUpisa", godinaUpisaTable.getSelectionModel().getSelectedItem());
		            mainViewManager.changeRoot("PredmetiUpis");;                   
		        }
		    }
		});
		
//		allSchoolYears = FXCollections.observableList( godinaCb.getValue());
//		godinaUpisaTable.setItems(allSchoolYears);								//kako da ne budu postavljenje sve godine u tabelu, nego samo ona koju mi izaberemo
	}
	
	public void handleUpisGodine(ActionEvent event) {
		allSchoolYears.add(godinaCb.getValue());
	}
}
