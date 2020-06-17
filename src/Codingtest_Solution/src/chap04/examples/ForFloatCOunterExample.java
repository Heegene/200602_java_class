package chap04.examples;

public class ForFloatCOunterExample {
	public static void main(String[] args) {
		for(float x=0.1F; x<=1.0F; x+=0.1F) {
			System.out.println(x);
			
			// 0.1은 float 타입으로 정확하게 표현할 수 없기 때문에 x에 더해지는 실제값은 0.1보다 약간 커서
			// 결국 loop는 9번만 실행됨
			// for문 조건에 실수 사용하지 말 것 
		}
//출력 결과

//		0.1
//		0.2
//		0.3
//		0.4
//		0.5
//		0.6
//		0.70000005
//		0.8000001
//		0.9000001

	}
}
