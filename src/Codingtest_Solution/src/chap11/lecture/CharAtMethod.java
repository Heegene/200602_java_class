package chap11.lecture;

public class CharAtMethod {
	public static void main(String[] args) {
		
		String str1 = "abcedf";
		// str1은 String type이라 String에 있는 method를 사용할 수 있게 되는것
		System.out.println(str1.charAt(0)); // a 출력 
		// char 타입으로 리턴되므로 char에 할당 가능
		char c1 = str1.charAt(0);
		System.out.println(c1);
		
		char c2 = str1.charAt(5);
		System.out.println(c2); // f 출력
		
	}
}
