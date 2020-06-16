package chap08.lecture.anonymous;

public class MyClass implements MyInterface {

	// 인터페이스 받으면 추상메소드 구현해야 할 책임 가짐
	

	public void method1() {
		System.out.println("구현된 메소드");
	}
	
	void method2() {
		System.out.println("클래스에 구현된 메소드2");
	}
}
