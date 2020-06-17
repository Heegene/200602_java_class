package chap08.examples.sec080503;

import chap08.examples.sec080502.HankookTire;
import chap08.examples.sec080502.Tire;

public class Car {
	
	Tire[] tires = { // Tire 배열이면 각 원소는 Tire타입이기만 하면 됨
			new HankookTire(), // HankookTire도 타이어 인터페이스를 구현했으니 들어갈 수 있음 
			new HankookTire(),
			new HankookTire(), 
			new HankookTire()
	};
	
	void run() {
		for (Tire tire : tires) {
			tire.roll(); // tire 하나씩 반복 
		}
	}

}
