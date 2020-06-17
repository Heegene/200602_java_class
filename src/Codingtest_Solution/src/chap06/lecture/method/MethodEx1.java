package chap06.lecture.method;

public class MethodEx1 {
	public static void main(String[] args) {
		
		MyClass c1 = new MyClass(); // 인스턴스 생성 (인스턴스 참조값을 c1이 갖게 됨. c1 객체(=c1 인스턴스)
		
		
		c1.myMethod(); // "마이 메소드" 출력
		
		
		c1.myMethod(200);
		
		c1.myMethod(2,3);
		
	}
}
