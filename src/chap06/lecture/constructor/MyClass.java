package chap06.lecture.constructor;

public class MyClass {
	// 필드와 메소드 정보 작성
	
	int number;
	String name;
	
	
	public MyClass() {
		
		// 인스턴스 생성 시 해야 할 일들을 여기에 기재 
		System.out.println("할일 1번");
		
		number = 30;
		name = "갱얼쥐";
	
	}
	
	//생성자는 하나 이상 있을 수 있음 parameter 받는 생성자를 만들 수도 있음
	
	MyClass(String n) {
		number = 30;
		name = n;
		
	}
	
	MyClass(int nu, String n) {
		System.out.println("int, String parameter를 받는 생성자");
		number = nu;
		name = n; 
		
	}
	
	
	}

