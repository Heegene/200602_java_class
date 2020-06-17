package chap09.examples.sec090302;

public class A {
	
	int field1;
	
	void method1() { }
	
	static int field2;
	static void method2() { }
	
	class B { // 인스턴스 클래스
		void method() {
			// 바깥 클래스의 인스턴스멤버, 스태틱 멤버 둘다 접근 O
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
			
		}
	}
	
	static class C { // 스태틱 클래스
		void method() {
			// 스태틱 중첩 클래스에서는 바깥클래스의 인스턴스 멤버에 접근 X
			// field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}

}
