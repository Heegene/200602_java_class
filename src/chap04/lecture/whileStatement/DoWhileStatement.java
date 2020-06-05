package chap04.lecture.whileStatement;

import java.util.Scanner;

public class DoWhileStatement {
	public static void main(String[] args) {
		// do while
		// do {명령문들} while (조건);
		// while과 유사하나, while은 
		
		while (true) { // 처음 만나는 것이 조건이고, true면 조건 실행
			System.out.println("실행문");
			break;
		}
		
		do { // 우선 조건을 판단하지 않고 실행문을 돌린 다음 그 다음에 조건을 확인
			// 조건이 맞으면 다시 반복반복 
			System.out.println("실행문 do while");
		} while (false); 
		
// -------------------------------------------------------------------------------
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">"); //무조건 한번은 출력을 하므로 쭈르륵 실행
			inputString = scanner.nextLine();
			System.out.println(inputString); // 입력받은 것 출력
			
		} while (!inputString.equals("q")); // 그 다음 조건 확인 
		// 입력받은 것이 q가 아니라면  계속 실행 
		System.out.println(); 
		System.out.println("프로그램 종료");
		
	}
}
