package chap10.examples.sec100203;

public class NumberFormatExceptionExample {
	
	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		
//출력결과
//Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
//	at java.lang.NumberFormatException.forInputString(Unknown Source)
//	at java.lang.Integer.parseInt(Unknown Source)
//	at java.lang.Integer.parseInt(Unknown Source)
//	at chap10.examples.sec100203.NumberFormatExceptionExample.main(NumberFormatExceptionExample.java:11)

	}

}
