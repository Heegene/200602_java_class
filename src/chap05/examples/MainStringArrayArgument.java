package chap05.examples;

public class MainStringArrayArgument {
	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("Java MainStringArrayArgumenet num1 num2");
			System.exit(0);
			

		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		// argument 설정을 해 주지 않으면 프로그램의 사용법 java main~~ num1 num2 가 출력됨
		// run configuration에 들어가서 argument를 2개 설정해 주면 두 argument가 합해진 값이 나옴 
		
	}
}
