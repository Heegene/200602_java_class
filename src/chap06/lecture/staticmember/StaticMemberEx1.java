package chap06.lecture.staticmember;

public class StaticMemberEx1 {
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();
		
		c1.field1 = 3;
		c2.field1 = 4;
		
		c1.field2 = 99;
		c2.field2 = 100;
		
		//왜 스태틱멤버가 클래스멤버로도 쓰냐면
		// 클래스 이름으로도 접근가능
		MyClass.field2 = 200; 
		
		System.out.println(c1.field1); // 3 각각 값을 갖게 됨 
		System.out.println(c2.field1); // 4
		
		System.out.println(c1.field2);
		System.out.println(c2.field2); // 200으로 출력됨
		
		// 클래스 메소드를 실행하기 위해서는(모든 인스턴스가 이 메소드를 공유하고 있으므로)
		c1.method2(); // 클래스 내의 아무거나 잡고 메소드 실행시켜도 됨 
		c2.method2();
		MyClass.method2();  // 클래스 이름만 가지고도 실행 가능
		
		
	}
}
