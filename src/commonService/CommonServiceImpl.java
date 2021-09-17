package commonService;

import javafx.scene.Parent;
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
	
	

}
