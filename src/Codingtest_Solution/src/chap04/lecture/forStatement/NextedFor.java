package chap04.lecture.forStatement;

public class NextedFor {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) { //i 값이 올라갈때마다 
			for (int j = 1; j <= 9; j++) {   // j부분의 for문을 쭉 다시 실행하는것 
				System.out.println(i + "*" + j + "=" + (i+j));
			
		}
			
		}
	}
}
