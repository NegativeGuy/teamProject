package dbService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import memberService.MemberDTO;

public class DBService {
	 public static Connection conn;
	 
	 public DBService() { //생성자로 오라클과 연동
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@210.221.253.215:1521:xe","java4jo","4444");
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dydgns2446","evan9396");
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 
	 public int insert(MemberDTO dto) {
	 
		 String sql = "insert into book_member(id,pwd) values(?,?)";
		 int result = 0;
		 
		 try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return result;
	 }
	 
	 public MemberDTO loginCheck(String inputID) {
		 String sql = "select * from book_member where id= ?";
		 
		 MemberDTO dto = null;
		 
		 try {
			 PreparedStatement ps = conn.prepareStatement(sql);
			 ps.setString(1, inputID);
			 ResultSet rs = ps.executeQuery();
			 
			 if(rs.next()) {
				 dto = new MemberDTO();
				 dto.setLoginid(rs.getString("id")); //아이디가 없으면 null이 입력
				 dto.setLoginpw(rs.getString("pwd"));
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return dto;
	 }
}
