package chap02.lecture.type;

public class CharType {
	public static void main(String[] args) {
		// char (character) type 문자형 !
		// 크기가 2 byte 
		// short과 마찬가지. 다만 short는 정수형 표현을 위한거라 음수부터 양수 사이
		// char의 경우 음수를 표현할 필요가 없음. 문자 코드 표현하는거
		// 65536개의 값을 가질 수 있음
		// 가장 작은 건 0000 0000 0000 0000 ~ 1111 1111 1111 1111 사이의 값을 가짐
		// 16진법으로 표현하면 0000 ~ FFFF까지 표현이 가능함
		
		char c;
//		c = '\uFFFF'; // 이렇게 하면 사람이 읽기 힘드므로 그냥 문자를 써도 됨
		c = '가';
		System.out.println(c);
		c = 'K';
		System.out.println(c);		
	
		// c = ''; // 문자를 안 담는 건 안됨
		// 2bye 내의 integer 값을 literal로 담을 수도 있음
		c = 65;
		System.out.println(c);
		
	}
}
