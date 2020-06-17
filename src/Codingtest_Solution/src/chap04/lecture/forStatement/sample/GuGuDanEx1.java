package chap04.lecture.forStatement.sample;

import java.util.Scanner;

public class GuGuDanEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력단");
		String dan = scanner.nextLine();
		int danNum = Integer.valueOf(dan);
		
		for (int i = 2; i <= 9; i += 2) {
			
			System.out.println(danNum + "*" + i + "= " + (danNum* i));
			
			
			}
		
	
		
	}

}
