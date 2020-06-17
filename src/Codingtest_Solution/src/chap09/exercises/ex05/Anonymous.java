package chap09.exercises.ex05;

public class Anonymous {

	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
			// 자전거가 달립니다 출력되도록

	void method1() {
		Vehicle localVar = new Vehicle () { // 로컬변수의 값 
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
				
				localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}
	
}
