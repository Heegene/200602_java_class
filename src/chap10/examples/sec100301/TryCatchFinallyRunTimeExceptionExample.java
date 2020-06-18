package chap10.examples.sec100301;

public class TryCatchFinallyRunTimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
//		String data3 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
//			data3 = args[2];
			
		}	catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("실행 방법 : ");
			System.out.println("Java try catch finally runtimexcetption example num1 num2");
			return; // 이거 return 없애면 첫번째try만 하고 끝나는 게 아니라 그 다음 두번째 try로 넘어감
			// return 에 의해 try문이 종료되게 됨 
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(data1 + "+" + data2 + "="+ result);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다. ");
			
		}  finally {
			System.out.println("다시 실행하세요.");
		}
		
		
	}
}
