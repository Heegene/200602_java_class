package chap03.examples;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; //-100 그대로출력
		int result2 = -x; 
		System.out.println("result1=" + result1); // -100 출력
		System.out.println("result2=" + result2); // 100 출력.  --100이 되어서 100출력 
		
		short s = 100; 
		
		// short result 3 = -s; integer short 으로 못들어감 int는 int로 담아서 쓰기 
		int result3 = -s;
		System.out.println(result3); // -100 출력
	}
}
