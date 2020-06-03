package chap03.examples;

public class InfinityAndNaNCheckExample {
	
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
//		double z = x % y;
		
		System.out.println(Double.isInfinite(z)); // true 가 출력됨. infinity 이므로
		System.out.println(Double.isNaN(z)); // NaN이 아니므로 false 출력
		
		System.out.println(z + 2); // Infinity 출력 
		
	}

}
