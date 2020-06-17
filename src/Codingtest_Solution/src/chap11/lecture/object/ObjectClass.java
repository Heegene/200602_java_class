package chap11.lecture.object;

public class ObjectClass {
	public static void main(String[] args) {
		
	
	// Object class는 모든 클래스의 최상위 클래스
	// API 목록에 있는 모든 클래스 목록의 최상위이기도 하고,
	// 내가 만든 클래스의 상위 이기도 함(모든 클래스에는 extends Object가 생략되어 있는 것)
	
	Object o1 = new MyClass(); // Object가 상위클래스이므로 이렇게 할당받을 수 있음 
	Object o2 = new MyClass();
	
	
	// 다양한 Object 소속 메소드가 있음
	// equals()
	System.out.println(o1 == o2); // 실제 참조값은 서로 다르므로 false
	System.out.println(o1.equals(o2)); // equals는 논리적으로 같은지를 확인함
	
	// 이 equals 메소드를 재정의할 수 있음
	// 필드값을 보고 필드값만 같으면 같도록 판단내리도록
	// MyClass에서 override 
	
	
		
	
	}
}
