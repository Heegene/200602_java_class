package chap06.exercises;

public class MemberService {
	String id;
	String password; 
	
	
	public boolean login(String id, String password) {
//		this.id = id; 이거 안적어도됨 
//		this.password = password;
		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false; 
		}
		
	}
	
	
	public void logout(String id) {
//		this.id = id; 안적어도됨 
		System.out.println("로그아웃 되었습니다.");
	}

}
