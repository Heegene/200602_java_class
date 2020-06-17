package chap06.lecture.staticmember;

public class YourClass {
	int field1;
	static int field2;
	
	void method1() {
		System.out.println(this.field1);
		// this는 해당 인스턴스에 의해 만들어진 값을 가리키는 것 "해당 인스턴스" 한정
		// 이 경우 method1 안에서의 this
		
		
	}
	
	
	static {
		field2 = 99;
	}
	
	static void method2() {
//		System.out.println(this.field1); static에서 쓰려고 하면 오류가 남
		// this는 해당 인스턴스 내 라는 범위가 있는데
		// static은 모든 인스턴스가 공유하므로 범위가 맞지 않음 
		// 인스턴스 멤버 자체를 쓸 수가 없음
		
//		System.out.println(field1); 이것도 쓸 수 없음
		// 인스턴스 멤버에 접근할 수 없음 대상이 불분명하기때문..인스턴스 멤버 자체가 인스턴스 한정이므로
		// 인스턴스 메소드에도 접근할 수 없음
		// 스태틱끼리는 접근 가능
		
	// 반대로 인스턴스에서 스태틱 멤버로의 접근은 대상이 명확하므로 가능
		
		
	}
}
