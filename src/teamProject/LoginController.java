package teamProject;

import java.net.URL;
import java.util.ResourceBundle;

import dbService.DBService;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;
import register.RegisterMain;

public class LoginController implements Initializable{
	Parent root;
	RegisterMain rg;
	LoginService ls;
	
	public void setRoot(Parent root) {
		this.root = root;
		//System.out.println("LoCon : "+root);
	}
		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		rg = new RegisterMain();
		ls = new LoginService();
		
	}
	
	public void goRegister() {
//		rg.setStage((Stage)root.getScene().getWindow());
//		스테이지 공유하려면 사용
		
		rg.viewRegister();
	}
	
	public void login() {
		ls.setRoot(root);
		ls.emptyCheck();
	}
}
