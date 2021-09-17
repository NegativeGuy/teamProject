package memberService;

import dbService.DBService;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MemberServiceImpl implements MemberService{
	
	Parent root;
	TextField enterID, enterPwd;
	Label IDLabel, PwdLabel, CPwdLabel;
	int cpwdchk;
	private static DBService db = new DBService();
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
		//System.out.println("mem : "+root);
		
	}

	@Override
	public void membership() {
		//System.out.println("회원가입 완료");
		cpwdchk=0;
		IDCheck();
		PwdCheck();

//		enterID = (TextField)root.lookup("#enterID");
//		enterPwd = (TextField)root.lookup("#enterPwd");
		
		MemberDTO dto = new MemberDTO();
		
		//System.out.println(enterID.getText());
		dto.setId(enterID.getText());
		//System.out.println(dto.getId());
		
		dto.setPw(enterPwd.getText());
		if(cpwdchk==1) {
			int result = db.insert(dto);
			if(result == 0) { // 0이 리턴되는 2가지 경우는 빈칸이거나 중복
				if(enterID.getText().isEmpty()) {
					IDLabel.setText("아이디는 필수 사항입니다");
					enterID.requestFocus();
				}else {				
					IDLabel.setText("존재하는 아이디 입니다");
				}
			}else {
				IDLabel.setText("회원가입 성공");
				CPwdLabel.setText("");
				//메인화면으로 이동 매서드
			}
		}
		
	}
	
	public void IDCheck() {
		enterID = (TextField)root.lookup("#enterID");
		IDLabel = (Label)root.lookup("#IDLabel");
		if(enterID.getText().isEmpty()) {
			IDLabel.setText("아이디는 필수 사항입니다");
			enterID.requestFocus();
		}else {
			IDLabel.setText("");
		}
	}
	
	public void PwdCheck(){
		enterPwd = (TextField)root.lookup("#enterPwd");
		PwdLabel = (Label)root.lookup("#PwdLabel");
		if(enterPwd.getText().isEmpty()) {
			PwdLabel.setText("비밀번호는 필수 사항입니다");
			enterPwd.requestFocus();
		}else {
			PwdLabel.setText("");
		}
		
		TextField confirmPwd = (TextField)root.lookup("#confirmPwd");
		CPwdLabel = (Label)root.lookup("#CPwdLabel");
		if(confirmPwd.getText().isEmpty()) {
			CPwdLabel.setText("비밀번호 확인은 필수 사항입니다");
			confirmPwd.requestFocus();
		}else if(enterPwd.getText().equals(confirmPwd.getText())){
			CPwdLabel.setText("비밀번호 확인 완료");
			cpwdchk++;
		}else{
			CPwdLabel.setText("비밀번호를 잘못 입력하셨습니다");
		}
	}
	
	//public void 메인화면으로 이동 매서드(){
		
	//}
}
