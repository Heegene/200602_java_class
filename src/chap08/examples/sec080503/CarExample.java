package chap08.examples.sec080503;

import chap08.examples.sec080502.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		
		Car mc = new Car();
		
		mc.run(); // 넷다 한국타이어 
		
		mc.tires[0] = new KumhoTire(); // 앞에꺼 하나 금호
		mc.tires[1] = new KumhoTire();  // 두번째꺼 금호
		// 금호도 Tire 를 구현한거니까 가능 
		
		mc.run();  // 금호금호한국한국 
		
	}
}
