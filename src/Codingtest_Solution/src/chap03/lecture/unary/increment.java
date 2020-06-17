package chap03.lecture.unary;

public class increment {
	public static void main(String[] args) {
		// 증감연산자 ++ -- (단항연산자)
		
		int a = 5;
		// 증가연산자는 변수가 가진 값에 1을 더해서 변수에 넣음 
		a++; 
						System.out.println(a); // 6 출력
		
	   // 감소연산자는 변수가 가진 값에 1을 빼서 변수에 넣음
	    a--;
						System.out.println(a); // 5 출력
	
	   // 증감연산자는 피연산자가 오른쪽에 있어도 되긴 하는데 사용해 주의해야함
						
						++a; // 이것도 +1
						--a; // 이것도 -1
						System.out.println(a);
						
						int c = ++a +1; // a에 1을 더한다음에 1을 더해서 7이 나옴
						
						// 이런 경우 문제가 됨	
						c = a++ + 1; // 더하기 전의 a를 사용하고 더함  a는 현재 6인 상태를 먼저 사용하고 어쩌고...
						//이런 경우 보기가 불편하니 다른 연산자랑 섞어서 쓰지 말 것
						// 가끔 시험에 나오는 경우가 있음 근데 사용할일은 ㄴㄴ 
						System.out.println(a);
						
						System.out.println(c);

						
	}
}
