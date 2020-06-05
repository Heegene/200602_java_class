package chap04.lecture.whileStatement;

public class WhileStatement {
	public static void main(String[] args) {
		// 기본 syntax
		// while (조건) {명령문들;;;}
		// 조건이 false가 될 때까지 반복 실행
		
		int i=0;
		while (i<5) {
			System.out.println("실행문");
			i++; // 이런 식으로 종료에 가까워지는 방식을 정의해주지 않으면 무한 루프에 빠짐 
		}
		
	}
}
