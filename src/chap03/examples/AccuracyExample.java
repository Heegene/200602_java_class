package chap03.examples;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다."); // 0.29999999999999993조각이 남는다.
		
		// 실수 연산을 할 때 실수를 이진법으로 바꿔서 64비트나 32비트 공간에 저장할 때
		// 근사한 값으로 저장되어 연산되므로 원하지 않는 결과가 나올 수 있음
		// 
	}
}
