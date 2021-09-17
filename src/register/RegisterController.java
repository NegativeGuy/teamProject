package register;

import java.net.URL;
import java.util.ResourceBundle;

import commonService.CommonServiceImpl;
import commonService.commonService;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import memberService.MemberService;
import memberService.MemberServiceImpl;


public class RegisterController implements Initializable{
	private Stage stage;
	private Parent root;
	private commonService cs;
	private MemberService ms;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//System.out.println("1111");
		cs = new CommonServiceImpl();
		ms = new MemberServiceImpl();
	}
	
	public void setRoot(Parent root) {
		//System.out.println("ReCon1 : "+root);
		this.root = root;
		this.stage = (Stage)root.getScene().getWindow();
		cs.setRoot(root);
		ms.setRoot(root);
	}
	
	public void register() { // 회원가입
		ms.membership();
	}
	
	public void goBack() { //창 닫기
        cs.windowClose();
	}

}
