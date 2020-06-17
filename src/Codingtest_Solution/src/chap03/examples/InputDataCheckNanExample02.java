package chap03.examples;

public class InputDataCheckNanExample02 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0; // NaN일 경우에는 입력받은 value를 0.0으로 바꾸어서 다시 돌리도록 함 
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
