package chap03.examples;

public class CheckOverflowExample {
	public static void main(String[] args) {
		// main method 안에 statements 작성하고있는데
		// 우리가 작성하는 클래스 파일 안에는 여러 method가 있을 수 있는데
		// 그중에 main이 가장 먼저 실행됨
		// try block 안에있는 놈이 예외사항이 발생하면 실행흐름이 catch block 으로 넘어감
	
		try {
			int result = safeAdd(2000000000,2000000000); // argument로 2개의 값을 받고 호출된 safeAdd는 밑에 정의되어있음
			System.out.println(result); // safeAdd에서 던진걸 try가 받음
		} catch(ArithmeticException e) { // try에서 받은걸 catch가 받아서 
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음"); // 이 내용을 출력하고 끝나게 됨 
			
		}
		
	}
	public static int safeAdd(int left, int right) { // left, right parameter에 20억씩 담고 statement 실행됨
		if ((right>0)) { // if 실행되는데 right이 0보다 큰가? true이므로 그 안의 내용 실행
			if (left>(Integer.MAX_VALUE - right)) { // if 안에 또 if. left가 인티저의 최대값을 넘어가는가? 
				// 20억은 1억보다크니까 true 
				throw new ArithmeticException("오버플로우 발생"); // arithmetic exception 이라는 예외를 출력하고 던짐
				// 예외 발생하고 던졋으므로 해당 메소드에서의 실행은 끝남 
			}
		} 	else {
			if (left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right; 
		
	}
}