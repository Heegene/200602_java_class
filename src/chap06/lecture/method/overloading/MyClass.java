package chap06.lecture.method.overloading;

public class MyClass {
	// method overloading
	// : 메소드의 이름이 같지만 파라미터에 따라 
	//   다른 메소드로 구분되는 것
	//   파라미터 개수가 달라도 되고(0개, 1개,... ) 타입이 달라도 됨 (string과 int)
	//   메소드 명, 파라미터 타입, 메소드 파라미터 개수가 같으면 그건 구분될 수 있는 메소드가 아님
	//   identical 한 것으로 인식됨 
	//   만약 다 같은데 리턴 타입이 다르다! 그렇다 해도 같은 메소드로 인식함 구분이 안됨 
	
	
	void method() {
		
	}
	
	void method(String i) {
		
	}
	
//	void method(String i) {
//		
//		return 0;
//	}
	
	void method(int i) {
		
	}
	
	void method(int i, int j) {
		
	}
	
	
}
