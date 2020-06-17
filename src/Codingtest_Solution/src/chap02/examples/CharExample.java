package chap02.examples;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A'; // A
		char c2 = 65; // A  출력
		char c3 = '\u0041'; //A
		char c4 = '가'; //가
		char c5 = 44032; //가
		char c6 = '\uac00'; //가
		
		int uniCode = c1; // 해당 변수에 저장된 유니코드를 알고 싶으면 int 타입 변수에 저장해 보면 됨 
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode); // Unicode에 해당하는 문자를 출력함 65=A 
		
	}
}
