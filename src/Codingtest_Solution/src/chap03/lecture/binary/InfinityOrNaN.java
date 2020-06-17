package chap03.lecture.binary;

public class InfinityOrNaN {

	public static void main(String[] args) {
		
		// 산술연산시 주의사항 2
		
		// %나 / 를 할 때 
		int i = 5;
		int j = 0;
//		int k = i / j;
//		int o = i % j; 
//		System.out.println(k);
		// 수를 0으로 나눌 수가 없음. 나누는 순간 프로그램이 오류가 나고 종료됨
		// 산술연산에 exception 발생 - 12번째 줄에서 0으로 나누려고 했다는 메시지 
		
		double d = 5.0;
		double e = 0.0;
		double f = d / e;
		System.out.println(f); // 실수를 0으로 나왔을 때 infinity 가 나옴 
		
		e = -0.0;
		f = d / e;
		System.out.println(f); // 마이너스 무한대인 -infinity 가 나옴 
		f = f + 100000000000000000L; 
		System.out.println(f); // 무한대에 어떤 연산을 하든 -Infinity 나옴
		
		// modular 연산의 경우 NaN이 뜸 
		f = d % e;
		System.out.println(f); // NaN 이라고 Not a Number 라는게 나옴 
		f = f  + 10000000000L;
		System.out.println(f); // NaN에 뭘 하든 NaN으로만 나옴 
				//이경우 사용하는 방법
		System.out.println(Double.isInfinite(f)); //
		System.out.println(Double.isNaN(f)); // true 출력 
		
	}
	
}
