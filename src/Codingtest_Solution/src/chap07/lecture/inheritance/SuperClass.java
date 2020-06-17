package chap07.lecture.inheritance;

public class SuperClass {
	public int field;
	
	// 생성자 생략
	// 생성자 생략하면 public SubClass() {} 이 들어간 것과 똑같음
	// 생성자 호출할때 다른 생성자를 호출하려면 this를 사용할 수 있었음
	
	public SuperClass (int i) {
		
	}
	
	public SuperClass () {
	
//		부모 클래스의 생성자를 호출하는 코드 super();
// 한번은 무조건 써줘야 하는데 없으면 컴파일러가 알아서 삽입해줌
	
		
	}
	
	public void method() {
		System.out.println("슈퍼클래스 메소드");
	}
	
	public void method2() {
		System.out.println("서브클래스 메소드");
	}
}
