package chap06.exercises;

public class ShopService {
	static ShopService ShopService; 
	// 생성자를 사용해서 인스턴스 만들 수 없게 제한해야함
	private ShopService () {  // 만든 다음 공개하지 않음
		// 그러면 이 클래스로 인스턴스 만들 수 없음
		
		
		
		
	}
	
	static ShopService getInstance() { // 인스턴스 만들어서
		return ShopService; // 그대로 리턴
	}
	
}
