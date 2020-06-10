package chap06.lecture.method;

public class MyClass {
	
	// 필드
	
	// 생성자
	
		
	// 메소드
	// 리턴타입 메소드명(파라미터 리스트) {
	//    메소드 명령문 
	// }
	
	// 파라미터 리스트: 타입 파라미터명 
	
	void myMethod() {
		
		System.out.println("마이 메소드");
	}
	
	void myMethod(int a) {
		System.out.println("마이메소드 실행");
		System.out.println("파라미터 :" + a);
	}

	
	void myMethod(int a, int b) {
		System.out.println("마이 메소드 실행");
		System.out.println("파라미터 1번 : " + a);
		System.out.println("파라미터 2번 : "+ b);
	}
}
