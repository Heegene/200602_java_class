package chap06.examples.sec060804;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator mycal = new Calculator();
		
		// 정사각형의 넓이 구하기
		double result1 = mycal.areaRectangle(10);
		
		
		// 직사각형의 넓이 구하기
		double result2 = mycal.areaRectangle(10, 20);
		
		
		System.out.println(result1);
		System.out.println(result2);
		
		
	}
}
