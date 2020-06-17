package chap11.examples;

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = new String("이콩이");
		String str2 = "이콩이";
		
		if (str1 == str2) {
			System.out.println("같은 String 객체를 참조합니다.");
		} else {
			System.out.println("다른 String 객체를 참조합니다.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("같은 문자열을 가집니다.");
		} else {
			System.out.println("다른 문자열을 가집니다.");
		}
	}
}
