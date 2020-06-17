package chap04.lecture;
import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scanner는 다른 패키지에 있어서 import 해주어야 함
		// import java.util.Scanner; 사용
		
		System.out.println("메세지 입력");
		String myMessage = scanner.nextLine(); // 메세지 입력이 출력된 다음에 사용자로부터 입력 기다리는 란 
		
		System.out.println(myMessage);
		
	}
}
