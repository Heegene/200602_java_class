package chap04.lecture;

import java.util.Scanner; // ctrl shift o 누르면 임포트됨 

public class RSPGame {
	public static void main(String[] args) {
		
		System.out.println("1-가위/ 2-바위/ 3-보");
		// 1. 가위 2. 바위 3. 보
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		int user = Integer.valueOf(userInput);
		int com = (int) (Math.random()*3)+1 ;
		
		String message; 
		if (user == com) {
			message = "비겼습니다.";
			
		} else if (user ==1 && com == 3) {
			message = "이겼습니다.";
		} else if (user ==2 && com == 1) {
			message = "이겼습니다." ;
		} else if (user==3 && com ==2 ) {
			message = "이겼습니다.";
		} else {
			message = "졌습니다.";
		}
		
		String userStr;
		
		if (user==1) {
			userStr = "가위";
		} else if (user==2) {
			userStr = "바위";
		} else {
			userStr = "보";
		}
		
		String comStr;
		if (com==1) {
			comStr = "가위";
		} else if (com==2) {
			comStr = "바위";
		} else {
			comStr = "보";
		}
		
		
		System.out.println("User= " + userStr);
		System.out.println("Com= " + comStr);
		System.out.println(message);
		
	}
}
