package chap09.examples.sec090203;

public class Main {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B(); // B 객체 만들때 바깥 클래스의 인스턴스를 통해 만듦 
		
		b.field1 = 3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C(); // 스태틱은 바로 접근할 수 있으니 바로 접근해서 만듦 
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method(); // 밖에서 쓸 수 없으므로 a.method() 이렇게 메소드 호출을 통해 실행 
		
		
		
	}

}
