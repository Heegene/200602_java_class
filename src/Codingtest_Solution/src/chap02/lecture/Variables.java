package chap02.lecture;

public class Variables {
	// 변수: 값을 저장할 수 있는 이름 있는 공간
	//기본 타입 8개
	// 참조 타입 무제한
	public static void main(String[] args) {
		// 변수 선언 -> 타입명 변수명 나란히 써주면 됨 
		int varName;
		// 변수명: $ _ 영문(대소) 숫자 조합으로 이루어짐. 꼭 영문 아니어도 되는데 관습적으로 영어씀
		// 단, 숫자는 앞에 올 수 없음 
		// 변수명 작성 관습(convention) lowerCamelCase / 자스에서 쓰던방식 
		
		// 교재 31p 위 표
		int price;
		int $price;
		int _companyName;
//		int 1v; // 숫자로 시작하는건 불가능 
//		int @speed $와 _만 특수문자로 사용가능하므로 불가능 
//		int $#value 마찬가지로 안됨
		int firstname;
		int firstName; // 대소문자 구분하므로 윗줄과는 서로 다른 변수임 
		int maxSpeed; // lower camel case로 작성
		int carBodyColor; 
		
	}
}
