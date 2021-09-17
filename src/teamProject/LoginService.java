package teamProject;

import dbService.DBService;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import memberService.MemberDTO;

public class LoginService {
	
	Parent root;
	DBService db;
	TextField loginID, loginPw;
	Label loginIDMsg, loginPwMsg;
	MainPage mp;
	
	public LoginService(){
		db = new DBService();
		mp = new MainPage();
	}
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void emptyCheck() {
		loginID = (TextField)root.lookup("#loginID");
		loginPw = (TextField)root.lookup("#loginPwd");
		loginIDMsg = (Label)root.lookup("#loginIDMsg");
		loginPwMsg = (Label)root.lookup("#loginPwMsg");
		
		if(loginID.getText().isEmpty()) {
			loginIDMsg.setText("아이디를 입력해주세요");
			loginID.requestFocus();
		}else {
			if(loginPw.getText().isEmpty()) {
				loginPwMsg.setText("비밀번호를 입력해주세요");
				loginIDMsg.setText("");
				loginPw.requestFocus();
			}else {
				loginCheck();
			}
		}
	}
	public void loginCheck() {
		loginID = (TextField)root.lookup("#loginID");
		loginPw = (TextField)root.lookup("#loginPwd");
		loginIDMsg = (Label)root.lookup("#loginIDMsg");
		loginPwMsg = (Label)root.lookup("#loginPwMsg");
		
		
		MemberDTO dto = db.loginCheck(loginID.getText());
		//System.out.println(dto);
		
		// 무언가 입력했을 경우
		if(dto==null) {
			loginIDMsg.setText("존재하지 않는 아이디 입니다");
			loginPwMsg.setText("");
		}else {
			loginIDMsg.setText("");
			if(dto.getLoginpw().equals(loginPw.getText())) {
				loginPwMsg.setText("인증 성공");
				mp.setStage((Stage)root.getScene().getWindow());
				mp.setId(dto.getLoginid());
				mp.viewMainPage();
				
//				MainPageController mpc = new MainPageController();
//				mpc.userIdViewer(dto.getLoginid());
			}else {
				loginPwMsg.setText("잘못된 비밀번호를 입력했습니다");
			}
		}
	}
}
