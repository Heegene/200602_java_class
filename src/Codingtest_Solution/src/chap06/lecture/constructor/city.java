package chap06.lecture.constructor;

public class city {
	String name;
	String location;
	
	city(String name, String location) {
		this.name = name; // 앞으로 만들어질 클래스의 인스턴스의 name
		this.location = location; // 마찬가지 location 
		
	}
	
//	city() {
//		this.name = "서울"; // 참고로 여기는 ()안이 비어있으므로 this 생략해도되는상황인데 이해를위해 적음
//		this.location = "한국";
		// 이렇게 넣으면 위와 사실 중복되는상황
		// 다른생성자를 호출하여 호출
		
//	}
	
	city() {
		this("seoul", "korea"); // 메소드인 것처럼 쓰면 다른 생성자를 호출할 수 있음 
//		위에서 this.name한것과 this.location 한 정보를 가져와서 this.name에 알아서 서울을 넣고 this.location에 한국을 알아서 넣어줌
	}
	

}
