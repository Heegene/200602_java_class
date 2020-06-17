package chap04.examples;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m=9; m>=2; m--) { // 9단~2단 역으로 
			System.out.println("***" + m + "단" + "***");
			
			for (int n=9; n>=2; n--) {
				System.out.println(m + "*" + n + "=" + (m*n));
				
			}
			
		}
		
		
	}
}
