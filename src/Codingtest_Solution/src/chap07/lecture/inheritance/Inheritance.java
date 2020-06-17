package chap07.lecture.inheritance;

public class Inheritance {
	// 상속 : 부모의 멤버를 자식이 갖는다.
	public static void main(String[] args) {
		SubClass sub = new SubClass(); // 서브클래스의 인스턴스 생성
		
		System.out.println(sub.field); // 이것도 SuperClass에 있는거지만 상속받아서 사용 가능 
		sub.method(); // 이렇게도 사용 가능 '슈퍼클래스 메소드' 출력
		
		sub.method2(); //'서브클래스 메소드' 출력
		
		public SubClass() {
//			super(); 파라미터 없는 super();가 없으니 있는형식에 맞춰서 호출하라고 컴파일러 에러가 뜰 것
			super(3); // 부모클래스의 생성자를 한번은 호출해야 하고
			//그 statement는 다른 statement 보다 먼저 위치하고 있어야 함 
		}
		
	}
	

}
