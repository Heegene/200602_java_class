package chap06.lecture.accessModifier.a;

public class MyClass {

	
	// 생성자
	public MyClass() { 
		// public 이라는 키워드가 붙음
		
	}
	
	public MyClass(int a) {
		this(""); // 클래스 내부에서는 이런식으로 사용 가능 
		// MyClass(String o)를 사용한 상황 
		
	}
	
	private MyClass(String o) {
		
	}
	
	MyClass(double d) {
		// 아무것도 안 붙여주면 디폴트로 지정됨 =default 생략가능
		// 또다른 이름은 package private
		// 같은 패키지에 있는 애들까지만 사용가능 
		
	}
}
