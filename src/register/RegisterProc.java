package register;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import teamProject.LoginMain;

public class RegisterProc {
	private Stage Stage;
	
	public void setStage(Stage Stage) {
	        this.Stage = Stage;
	}

	public void viewRegister() {
		System.out.println("test");
		//Stage = new Stage();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../teamProject/Register.fxml"));
			
			Parent root = loader.load();
			Scene scene = new Scene(root);
			
			Stage.setScene(scene);
			Stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
