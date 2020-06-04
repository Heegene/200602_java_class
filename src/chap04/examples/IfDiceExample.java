package chap04.examples;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1 ;
		
		if (num==1) {
			System.out.println("1입니다.");
		} else if (num==2) {
			System.out.println("2입니다.");
		} else if(num==3) {
			System.out.println("3입니다.");
			
		} else if (num==4) {
			System.out.println("4입니다.");
		} else if (num==5) {
			System.out.println("5입니다.");
		} else {
			System.out.println("6입니다.");
		}
		
	}
}
