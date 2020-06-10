package chap06.lecture.method.instanceMember;

public class MemberEx1 {
	// member는 클래스의 구성 요소
	// 클래스는 필드, 생성자, 메소드가 있는데
	// 필드와 메소드를 묶어서 멤버라고 함
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();
		
		c1.method(99);
		c1.method(100);
		
		int i1 = c1.method();
		int i2 = c2.method();
		
		System.out.println(i1);
		System.out.println(i2);
		
	}
	
}
