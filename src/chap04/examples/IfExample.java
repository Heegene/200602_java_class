package chap04.examples;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
				
		}
		if (score<90) 
			System.out.println("점수가 90보다 작습니다."); // {} 생략하면 조건을 바로아래의 하나만 적용받음 
			System.out.println("등급은 B 입니다."); // IF랑은 상관없는 실행문 
			
		
		
	}
}
