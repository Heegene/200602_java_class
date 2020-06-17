package chap03.lecture.binary;

public class ConcatenateOperator {
	public static void main(String[] args) {
		// 연결 연산자 +
		
		String s = "text";
		// string = 문자'열' 
		// 문자 하나를 표현할 때는 ''로, 여러개를 표현할 때는 ""에 넣어서 사용
		String t = "t"; // 이건 문자열임 "" 안은 문자열
		String u = ""; // 이것도 문자열. 근데 '빈' 문자열
		
		// 문자열을 + 연산자의 피연산자로 둘 수 있음
		// 그렇게 되면 연결 연산자가 됨
		
		System.out.println(s + t); // textt  가 출력됨
		System.out.println(s + 5); // string과 다른 타입의 연산자를 연결하게 되어도 연결연산자로 사용됨 text5 출력 
		// 타입 섞이면 결과는 string 타입으로 반환됨 
		
		
		
		
	}
}
