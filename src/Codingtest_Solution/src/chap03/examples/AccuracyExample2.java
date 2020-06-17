package chap03.examples;

import java.math.BigDecimal;

public class AccuracyExample2 {
	public static void main(String[] args) {
		
		int apple = 1;
		
		int totalPieces = apple * 10; // 정수계산을 위해 10을 곱해줌
		int number = 7; // 10을 곱한 수인 7
		int temp = totalPieces - number; // integer 계산으로 바꿈
		
		double result = temp/10.0; // 다시 10으로 나눠줌
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면 ");
		System.out.println(result + "조각이 남는다.");
		// 원하는 계산값인 0.3이 출력됨 
		
		BigDecimal v1 = new BigDecimal("0.1");
		BigDecimal v2 = new BigDecimal("1");
		BigDecimal v3 = new BigDecimal("7");
		BigDecimal v4 = v2.subtract(v1.multiply(v3));
		System.out.println(v4); // 이렇게 해결할 수도 있음 BigDecimal class 사용
		
		
		
	}
}
