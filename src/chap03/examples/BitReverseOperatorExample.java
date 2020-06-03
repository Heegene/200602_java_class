package chap03.examples;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")"); // 10 
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")"); // 10 비트반전 = -11
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")"); // 10 비트반전 + 1 = -10
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")"); // -10
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")"); // -10 비트반전 = 9
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")"); // -10 비트반전 + 1 = 10 
		
		
		
		
	}
	// 이진법 변환된걸 텍스트로 보여지게 하려고 메소드 사용한 것
	// toBinaryString이라는 메소드를 정의해서 여러군데에서 사용한것
	// toBinaryString은 parameter 하나를 받으니까 넣어줄수잇는거
	// return 값을 리턴해줌 위에
	// 받은 integer 정수를 string 표현으로(bit표현) 만들어서 리턴
	// 그 결과를 받아서 출력 
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
		str = "0" + str;
		}
		return str; 
	}
	
}
