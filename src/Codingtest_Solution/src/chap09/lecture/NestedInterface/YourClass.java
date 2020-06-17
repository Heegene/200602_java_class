package chap09.lecture.NestedInterface;

public class YourClass implements MyClass.MyInterface { // 클래스명.인터페이스명 이렇게 implements
	@Override
	public void method() {
		System.out.println("추상 메소드");
	}
	
}
