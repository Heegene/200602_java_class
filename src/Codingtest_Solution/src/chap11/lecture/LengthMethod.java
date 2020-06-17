package chap11.lecture;

public class LengthMethod {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		int len = str1.length();
		
		System.out.println(len); // 8 출력됨
		
		
		//마지막 글자를 꺼내보고싶다면 ! 길이에서 1을 빼 보면 됨 
		char c = str1.charAt(len - 1);
		System.out.println(c);
	}
}
