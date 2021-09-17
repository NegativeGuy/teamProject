package memberService;

public class MemberDTO {
    private String id;
    private String pw;
    
    private String loginid;
    private String loginpw;
    
    public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getLoginpw() {
		return loginpw;
	}
	public void setLoginpw(String loginpw) {
		this.loginpw = loginpw;
	}
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

}
