package teamProject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import memberService.MemberDTO;

public class MainPageController implements Initializable{
	Parent root;
	MainPageService mps;
	int arrClk;
	Label userID;
	//MemberDTO dto;
	
	//ImageView fxImageView;
	
	public void setRoot(Parent root) {
		this.root = root;
		//userIdViewer();
		mps.setRoot(root);
		//fxImageView = (ImageView)root.lookup("#viewBook");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mps = new MainPageService();
		userID = new Label();
		//dto = new MemberDTO();
		
	}
	public void userIdViewer(String userId) {
		userID = (Label)root.lookup("#userIdViewer");
		userID.setText(userId);
	}
	
	public void arrowLeft() {
		arrClk = 0;
		mps.arrowClick(arrClk);
//		Image image = new Image(getClass().getResource("/teamProject/book2.png").toExternalForm());
//		fxImageView.setImage(image);
	}
	public void arrowRight() {
		arrClk = 1;
		mps.arrowClick(arrClk);
	}
	
	public void goBooking() {
		System.out.println("goBooking");
	}
	
	public void goRRoom() {
		System.out.println("goRRoom");		
	}
	
	public void goSearch() {
		System.out.println("goSearch");		
	}
}
