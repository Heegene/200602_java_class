package chap11.examples;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum); // 880815 출력 
		
		String secondNum = ssn.substring(7); 
		System.out.println(secondNum); // 1234567 출력
	}
}
