package chap03.examples;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1= " + result1); // 7
		
		int result2 = v1 - v2;
		System.out.println("result2 is" + result2); // 3
		
		int result3 = v1 * v2;
		System.out.println("result 3 is" + result3); //10
		
		int result4 = v1 / v2;
		System.out.println("result 4 is" + result4); //2
		
		int result5 = v1 % v2;
		System.out.println("result 5 is" + result5); //1
		
		double result6 = (double) v1 / v2;
		System.out.println("result 6 is " + result6); // 2.5 그냥 하면 int타입이라 소수점 아래가 날아가므로 double 로 해야 보임 
	}
}
