package register;

import commonService.CommonServiceImpl;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import teamProject.LoginController;

public class RegisterMain {
	
//	Stage stage; 
//	
//	public void setStage(Stage stage) {
//		
//		this.stage = stage;
//	}
//	스테이지 공유시 활성화
	
	public void viewRegister() {
			try {
				Stage stage = new Stage(); //스테이지 공유시 비활성화
				FXMLLoader loader = new FXMLLoader(getClass().getResource("../teamProject/Register.fxml"));
				//System.out.println("2222");
				Parent root = loader.load();
				Scene scene = new Scene(root);
				RegisterController ctl = loader.getController();
				//System.out.println("ReCon2 : "+root);				
				ctl.setRoot(root);
				
				stage.setScene(scene);
				stage.show();
				
			} catch (Exception e) {
				e.printStackTrace();
		}		
	}
}
