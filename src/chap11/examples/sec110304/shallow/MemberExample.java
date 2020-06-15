package chap11.examples.sec110304.shallow;

public class MemberExample {
	
	public static void main(String[] args) {
		
		// 원본 객체 생성
		
		Member original = new Member("Blue", "홍길동", "12345", 25, true); 
		
		Member cloned = original.getMember();
		
		cloned.password = "67890";
		
		System.out.println(" ");
		
		
		
	}

}
