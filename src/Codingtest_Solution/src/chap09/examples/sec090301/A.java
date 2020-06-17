package chap09.examples.sec090301;

public class A {
	// 인스턴스 멤버 클래스
	class B{}
	static class C{}
	
	
	// 인스턴스 필드
	B field1 = new B(); // 중첩 클래스를 사용한 예제 
	C field2 = new C(); // 스태틱 클래스
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
		
	}
	
	// 정적 필드 초기화
	// static B field3 = new B(); 스태틱 멤버에서는 인스턴스 멤버를 참조할 수 없음 
	static C field4 = new C();
	
	// 정적 메소드
	static void method2() {
		// B var1 = new B(); 스태틱 멤버는 인스턴스 멤버 참조 X
		C var2 = new C();
	}
	
}
