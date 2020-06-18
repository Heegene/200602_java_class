package chap10.examples;

public class NullPointerExceptionExample {
	
	public static void main(String[] args) {
		
		String data = null;
		System.out.println(data.toString());
		
//출력 결과
//Exception in thread "main" java.lang.NullPointerException
//at chap10.examples.NullPointerExceptionExample.main(NullPointerExceptionExample.java:8)

	}

}
