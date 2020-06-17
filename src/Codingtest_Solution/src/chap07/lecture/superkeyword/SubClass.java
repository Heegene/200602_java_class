package chap07.lecture.superkeyword;

public class SubClass extends SuperClass {
	private int field;
	
	public void method1() {
		
	}
	
	public void method2() {
		this.method1(); // 필드라는 변수는 얘밖에 없으니까 method1도 얘밖에 없으니까 생략 가능 method1(); 라고해도됨
		System.out.println(this.field);
		
		System.out.println(sfield); // 상속받았으니까 자기거랑 마찬가지이므로 이렇게 써도 됨
		// 그래도 상위꺼를 명시해주고싶다면
		System.out.println(super.sfield); // 이렇게 작성
	}
}
