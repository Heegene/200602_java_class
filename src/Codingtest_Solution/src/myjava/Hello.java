package myjava;

import java.time.LocalTime;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		LocalTime lt = LocalTime.of(H, M);
		lt = lt.minusMinutes(45);
		System.out.println(lt.getHour() + " " + lt.getMinute());
		
//			
//		if (M - 45 < 0) {
//			M = (M + 60) - 45;
//			H = H - 1;
//
//			if (H < 0) {
//				H = 24 - 1;
//			}
//
//		} else {
//			M = M - 45;
//		}

//		System.out.println(Integer.toString(H) + " " + Integer.toString(M));

	}
}
