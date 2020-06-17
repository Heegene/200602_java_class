package chap08.lecture.outterMember;

public class MyClass {
	// 중첩 클래스의 접근 제한 
	public int field;
	public static int fieldStatic;
	
	class NestedClass {
		public void method() {
			// 인스턴스 중첩 클래스는 바깥에 접근할 수 있음
			
			System.out.println(field); // 바깥의 멤버에 static이든 instance든 접근할 수 있음
			System.out.println(fieldStatic);
		}
	}
		
	static class NestedClassStatic {
		
		public void method() {
			
			System.out.println(fieldStatic);
//			System.out.println(field); // 스태틱 중첩 클래스는 바깥의 인스턴스 필드에 접근 불가 
		}
		
		
	}
	
	public void method() {
		class LocalClass {
			public void method() {
				// 로컬클래스의 경우 인스턴스 멤버와 스태틱 멤버 모두 접근 가능 
				System.out.println(field);
				System.out.println(fieldStatic);
			}
		}
	}
		
		
	
	
	
}
