package chap08.lecture.anonymous;

public class AnonymousClass {
	// 클래스가 존재하지 않는데 인스턴스를 만드는 경우
	public static void main(String[] args) {
		
		MyInterface i1 = new MyClass();
		i1.method1();
		
		MyInterface i2 = new MyInterface() {
			public void method1() {
				System.out.println("무명 클래스");
			}
			public void method2() {
				System.out.println("무명 클래스 2");
			}
		}; // 인터페이스로 구현한것처럼보이지만
		// 인터페이스에 관련된 클래스 몸통을 통해 인스턴스를 만드는 것과 같음
		// 추상 메소드 구현한 메소드가 꼭 있어야 함
		
		i2.method1(); // 인스턴스의 메소드 구현해놓은 것이 클래스이름 없이 실행됨
		i2.method2();
		
		// 만약 추상메소드 2개 있으면 무명클래스도 마찬가지로 2개 구현해야함
		
		
	}
}
