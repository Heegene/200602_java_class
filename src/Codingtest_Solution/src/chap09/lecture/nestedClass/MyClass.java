package chap09.lecture.nestedClass;

public class MyClass {
	// 필드
	// 생성자
	// 메소드
	
	void method() {
		class NextedClassLocal {
			// 메소드 안에도 클래스를 생성할 수 있음 
			// 필드
			//생성자
			// 메소드
		}
	}
	NestedClassLocal l1 = new NextedClassLocal(); // 메소드 밖이므로 사용 불가 
	
	// 클래스도 여기에 작성할 수 있음
	
	class NestedClass {
		
		
	}
	
	static class NextedClassStatic {
		
	}
	
}
