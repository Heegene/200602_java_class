package chap08.examples.sec080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vc = new Bus();
		
		vc.run();
//		vc.checkFare(); 이건 vc타입이라 못씀 
		
		Bus bus = (Bus) vc; // 강제 형변환
		// 애초 만들어진 게 Bus 인스턴스로 만들어진거라 강제형변환 가능
		
		bus.run();
		bus.checkFare();
		// 버스클래스에있던거 사용가능해짐 
		
		// 인스턴스는 하나지만 참조변수의 타입을 바꿔서 bus에 있던 메소드 사용 가능
		
		// 다만 이렇게 쓸 때 instanceof 확인하고 쓰는 게 좋음
		if (vc instanceof Bus) {
			bus = (Bus) vc; // Bus인스턴스라면 Bus타입 형변환 
			bus.run();
			bus.checkFare(); 
		}
		
	}

}
