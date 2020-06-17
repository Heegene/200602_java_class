package chap06.lecture.staticmember;

public class MyClass {
	// 인스턴스 필드
	
	int field1;
	
	// static 필드(또는 클래스 필드라고도 함)
	static int field2;
	// 앞에 static이라는 키워드가 붙음
	
	
	// 인스턴스 메소드
	void method1() {
		
	}
	
	// static 메소드 (클래스 메소드)
	static void method2() {
		// 마찬가지로 앞에 static 키워드를 붙임
		System.out.println(" 클래스 메소드 실행");
		System.out.println(field2);
	}
	
	
	
}
