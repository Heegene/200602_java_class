package chap09.lecture.nestedClass;

public class NestedClass {
	
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass.NextedClassStatic c2 = new MyClass.NextedClassStatic();  // static이므로 클래스명으로 바로접근가능 
	
//		MyClass.NestedClass c3 = new MyClass.NestedClass() // 얘는 static이 아니라 클래스명으로 바로 접근 X 인스턴스 클래스명이라
				// 인스턴스에 먼저 접근해야 함 
		
		
	}
	}

