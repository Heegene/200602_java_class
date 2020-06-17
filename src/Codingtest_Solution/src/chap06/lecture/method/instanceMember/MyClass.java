package chap06.lecture.method.instanceMember;

public class MyClass {
	int field1;
	
	void method(int field) {
		this.field1 = field; // 필드나 메소드 앞에 this 키워드를 사용할 수 있음
		print("입력값: " + field); // 이 클래스의 인스턴스는 여러개 각각 존재하므로.
		// 인스턴스마다 자기의 메소드와 필드를 가짐
		// 자기자신의 필드에 99 넣어서 자기자신의 메소드 리턴값이 99가 나온것
		//남의꺼에 못넣게 this를 통해 각각 관리 
	}
	
	int method() {
		return this.field1;
	}
	
	
	
	void print(String a) {
		System.out.println(a);
	}
}
