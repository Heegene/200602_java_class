package chap04.examples;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("현재시간 = " + time + "시");
		switch(time) {
		
		case 8: 
			System.out.println("출근합니다."); // break 문이 없으면 해당되는것부터 쭉 출력됨 
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default: 
			System.out.println("외근을 나갑니다.");
		
		}
		
	}
}
