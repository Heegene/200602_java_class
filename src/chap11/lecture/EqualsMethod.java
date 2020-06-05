package chap11.lecture;

public class EqualsMethod {
	public static void main(String[] args) {
		String str1 = "JAVA";
		String str2 = new String ("JAVA");
		
		System.out.println(str1 == str2 ); // false 출력됨
		// str 2의 경우에는 참조타입을 담고 있기 때문에(primitive 아님) false가 나옴
		// 문자열 내용이 같더라도 참조타입때문에 같지 않다고 나옴
		// 내용만 비교하고 싶다면 equals 사용
		System.out.println(str1.equals(str2)); //true 출력
		System.out.println(str1.contentEquals(str2)); //contentEquals를 써도 됨 
		
	}
}
