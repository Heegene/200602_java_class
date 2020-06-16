package chap08.lecture.interfaceKeyword;

public interface MyInterface {
	
	// 다 추상 메소드임(public abstract) 
	void method1();
	public abstract void method2();
	
	// 위나 아래나 마찬가지.. void method1() 해도 public abstract 생략되어 있음
	
	// 인터페이스는 생성자는 없고 대신 필드는 가질 수 있음
	// 인스턴스 필드는 가질 수 없고 public static final 필드
	
	int MAX = 3; 
	int MIN = 0; 
	// 이렇게 하면 public static final 이 생략된 것과 마찬가지 상수처리됨
	// 인스턴스가 아니라 스태틱이므로 인터페이스명으로 바로 접근 가능
	
	
	// 자바 8부터 포함된 것 있음
	// default method 가 있음
	// 접근지정자의 default(pkg private)이랑은 다름
	// 이건 몸통이 있는 instance method
	
	default public void method3() {
		// 몸통이 있는 인스턴스 메소드 default 키워드가 꼭 있어야 함 
		System.out.println("인스턴스");
	}
	
	default public void method4() {
		System.out.println();
	}
	
	// static method도 추가될 수 있음 이것도 자바 8부터 추가된 기능
	static void method5() {
		System.out.println(); // 인터페이스에서 만들어진 건 다 public 이므로 public 생략해도됨 
	}
	
	public static void method6() {
		System.out.println();
	} // 추상 클래스와 인터페이스가 구분이 흐릿해짐
	// 대신 인터페이스는 여러개를 적용시킬 수 있음
	// 굳이 추상클래스로 할 이유가 없으면 인터페이스를 먼저 고려
	// 회사에서 사용하는 자바 버전이 8이 아닐수도 있음 그럼 default, static method사용 못함
	
	

}
