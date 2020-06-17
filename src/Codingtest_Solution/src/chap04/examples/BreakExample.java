package chap04.examples;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random() *6) + 1;
			System.out.println(num);
			if (num==6) {
				break; // 6이 나올때까지 반복하다가 6이 나오면 loop 종료 
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
}
