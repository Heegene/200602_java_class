package chap11.examples.sec110301;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
		
	}
	
	
	
	
	@Override
	
	public boolean equals(Object obj) { // Object 클래스가 가지고 있는 메소드의 오버라이딩 
		if(obj instanceof Member) { // obj가 가리키고 있는 인스턴스가 Member 클래스이면 true 
			Member member = (Member) obj; // obj를 member 타입으로 강제 형변환
			if(id.equals(member.id)) { // member.id 같으면 true  (id는 Member 생성자에 넣는 String) 
				return true;
			}
		} 
		return false; 
	}
}
