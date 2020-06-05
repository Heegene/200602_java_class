package chap04.examples;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i%2 !=0) { // 2의 배수가 아닌경우 조건으로 다시 돌아감 
				continue;
			}
			System.out.println(i); // 2의 배수만 출력됨 
		}
		
	}
}
