package chap07.examples.sec070703;

import chap07.examples.sec070702.Tire;

public class Car {
	
	// 필드
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽",2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
			
			// 타이어라는 필드 4개를 선언하지 않고
			// 타이어를 배열로 해서 사용했음 배열의 배열을 넣듯이 
	};
	
	//생성자 생략
	
	//메소드
	int run() { // 런이 돌때마다 타이어 배열에 
		System.out.println("자동차가 달립니다.");
		for (int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				// 각 아이템에 롤 메소드를 실행시키고 
				stop();
				return (i+1);
			}
			
			
		}
		return 0;
	}
	
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
}
