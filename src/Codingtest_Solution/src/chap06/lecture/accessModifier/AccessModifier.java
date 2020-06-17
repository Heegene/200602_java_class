package chap06.lecture.accessModifier;

import chap06.lecture.accessModifier.a.MyClass;

public class AccessModifier {
	// access modifier (접근 지정자 또는 접근 제한자)
	// private, default(package private), protected, public 총 4가지
	
	// private
	// 필드, 생성자, 메소드
	
	// default (package private)
	// 필드, 생성자, 메소드, 클래스에 사용 가능
	
	// protected
	// 필드, 생성자, 메소드
	
	// public
	// 필드, 생성자, 메소드, 클래스 
	
	public static void main(String[] args) {
		
		MyClass c = new MyClass();  
		MyClass c1 = new MyClass(3);
		MyClass c2 = new MyClass(""); // 컴파일 에러 발생 
		// public 키워드는 누구나 쓸 수 있는 것이지만 해당 MyClass (String o) 는 private이라 클래스 내부에서만 사용 가능
		MyClass c3 = new MyClass(3.14); // 다른 패키지에 있으므로 컴파일 에러 발생
		 
		
	}

}
