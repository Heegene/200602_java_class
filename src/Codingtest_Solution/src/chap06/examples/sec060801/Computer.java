package chap06.examples.sec060801;

public class Computer {
	int sum1(int[] values) { // sum1 메소드. integer 배열타입을 받음
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
	
		return sum;
	}
	
	
	int sum2(int ...values) { // integer를 여러 개 받는 메소드
		int sum= 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
			
		}
		return sum;
		
	}
	
}
