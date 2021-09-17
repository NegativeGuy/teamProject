package teamProject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import register.RegisterController;

public class MainPage {
	
	Stage stage;
	String Id;
	
	public void setStage(Stage stage) {
		
		this.stage = stage;
	}
	
	public void setId(String Id) {
		this.Id = Id;
	}
	
	public void viewMainPage() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("MainPage.fxml"));
			//System.out.println("2222");
			Parent root = loader.load();
			Scene scene = new Scene(root);
			MainPageController ctl = loader.getController();
			//System.out.println("ReCon2 : "+root);				
			ctl.setRoot(root);
			ctl.userIdViewer(Id);
			
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
