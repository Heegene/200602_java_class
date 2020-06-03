package chap03.examples;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1=" + result1); //true
		System.out.println("result2=" + result2); // false
		System.out.println("result3=" + result3); //true
		
		
		char char1 = 'A'; // 2바이트에 숫자인것처럼 코드가 들어가있음 
		char char2 = 'B';
		boolean result4 = (char1 < char2); // 큰지 작은지 비교 가능 숫자처럼 비교되어서.. 65랑 66 임 
		System.out.println("result4=" + result4); //true 
		
	}

}
