package commonService;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CommonServiceImpl implements commonService{
	
	Parent root;
	
	@Override
	public void setRoot(Parent root) {
		//System.out.println("CSCon : "+root);
		this.root = root;
		
	}

	@Override
	public void windowClose() {
		Stage stage = (Stage)root.getScene().getWindow();
        stage.close();
    		
	}
	
	public void alert(String msg, String header) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.setHeaderText(header);
		alert.show();
	}

}
