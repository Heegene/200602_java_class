package chap02.lecture.type;

public class IntType {
	
	public static void main(String[] args) {
		// int 
		// 크기 4 byte
		// 최대값 2,147,483,647
		// 최소값 -2,147,483,648 최소값~최대값 사이의 정수만 사용 가능 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int i;
//		정수 리터럴
		i = 30000;
//		이런식으로 지정 가능
//		다만 수가 매우 큰 경우 자리수를 구분하는 언더바를 넣어줄 수 있음 몇개들어가든 어디들어가든 상관없음 
		i = 2_147_483_600;
		System.out.println(i); // 2147483600 출력됨
		
		i = 027;  // 8진법을 사용할 경우 앞에 '0'을 붙여줌
		System.out.println(i); // 8진법 27이므로 10진법 23이 출력됨
		
		i = 0xA; // 16진법을 사용할땐 0x 를 붙임
		System.out.println(i); // 16진법 A가 10진법으로 전환되어 '10'이 출력됨 
		// 16진법은 대문자 소문자 상관없이 쓸 수 있음
		
		i = 0xbb;
		System.out.println(i); // 187 출력 
		
		
	}

}
