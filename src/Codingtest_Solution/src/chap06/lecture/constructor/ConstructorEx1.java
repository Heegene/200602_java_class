package chap06.lecture.constructor;

public class ConstructorEx1 {
	public static void main(String[] args) {
		MyClass m = new MyClass(); // 인스턴스 생성
		
		System.out.println(m.name);
		System.out.println(m.number);
		
		MyClass m2 = new MyClass();
		System.out.println(m2.number);
		
		m.name="갱얼스";
		System.out.println(m2.name); // 각각의 인스턴스를 가지므로 m2의 이름에는 영향이 없음 
		
//		출력결과
//		할일 1번
//		갱얼쥐
//		30
//		할일 1번
//		30
//		갱얼쥐
//
//		
	}
}
