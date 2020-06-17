package chap06.lecture.method.returnkeyword;

public class MyClass {
	
	void method1(int a) {
		
		// return 타입이 void 인경우에는 return을 써주지 않아도 됨
		// void는 없다는뜻인데 return이 없다는 뜻 - return 키워드 없어도 되고 있어도 됨
		
		// return : 1. 메소드 종료, 2. 키워드 옆의 값을 return
		System.out.println("메소드1 실행");
		return; // return 키워드 오른쪽에 값이 없으면 메소드 종료만 함
//		System.out.println("리턴 이후에 작성된 메시지"); // 리턴 이후에 작성하면 실행될 일이 없어서 컴파일 에러 생김 
		
			
	}
	
	int method2() { // 원하는 값의 타입을 리턴타입으로 작성 int[]면 배열타입 특정 클래스를 쓰고싶으면 MyClass 이렇게도 가능
		System.out.println("메소드2 실행");
		// void일 경우 리턴타입 안써도 되는데 리턴타입이 정해져 있는 경우 항상 리턴키워드를 만날 수 있게 적어줘야함
		
		return 1; // 이 경우 return 옆에 항상 int 타입이 와야 함 
	}

	int method3 (int b) {
		System.out.println("메소드3 실행");
		if (b > 10) {
			return 1000;
		} else {
			return -1000; // 리턴값은 꼭 literal 일 필요는 없고 return a + 1000; 이런식으로 연산의 결과여도 가능 
		}
	
	
		
		// 이렇게만 적으면 컴파일 에러가 남 항상 return을 만날 수 있어야 하는데
	}
	
	int method4() { // byte > int로는 자동형변환 이뤄짐
		byte k = 3;
		return k;
	}
	
	
	
	int method5() {
		long l = 5;
		return l; // 더 큰쪽으로는 자동형변환 불가
	}
	
	
	// 10보다 작은경우의 리턴이 없음 
}
