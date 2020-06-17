package chap03.lecture.unary;

public class NotBitOperator {
	public static void main(String[] args) {
		// ~
		// 피연산자가 정수(byte, short, int, long) 
		// 연산결과는 int 또는 long
		
		int i = 3;
		i = ~i; // 비트 반전
		System.out.println(i); // -4 출력
		// i가 3이라고 하면 이진법으로 11인데 integer type이니까 32 bit
		// 0000 0000 0000 0000 0000 0000 0000 0011 임 (1 byte가 8 bit니까) 
		// bit를 반전시켜서 1을 0으로 0은 1로
		// 1111 1111 1111 1111 1111 1111 1111 1100 이 나옴
		// i값이 이걸로 바뀜 
		// 맨앞의 부호비트가 1이므로 음수가 나오고..암튼 계산하면 -4 나옴
		
		long l = 3;
		l = ~l;
		System.out.println(l); // 이것도 -4 출력 
		
	}
}
