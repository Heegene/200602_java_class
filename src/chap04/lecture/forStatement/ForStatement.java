package chap04.lecture.forStatement;

public class ForStatement {
	public static void main(String[] args) {
		
		// for (초기값;조건;증감)  {실행내용} 기본 syntax
		
		// 실행 순서 1 -> 2 -> 2번이 true이면 -> {} 내용 실행 -> 3번 -> 2번
		//                     2번이 false이면 -> 종료
		
		for (int i = 0 ; i < 3 ; i++ ) {
			
			System.out.println("실행문");
		}
		
	}
}
