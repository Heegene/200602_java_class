package chap03.examples;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; // string과 lietral 숫자 string으로나옴
		String str2 = str1 + " 특징"; // 이것도 string과 string으로
		System.out.println(str2); //JDK6.0 특징
		
		String str3 = "JDK" + 3 + 3.0; // string + 정수 + 실수 string됨
		String str4 = 3 + 3.0 + "JDK"; // +연산자 왼쪽부터 계산됨 
		System.out.println(str3); // JDK33.0
		System.out.println(str4); // 6.0JDK (왼쪽 숫자끼리 먼저 계산된뒤 string과 합쳐짐)ㄴ
	}
}
