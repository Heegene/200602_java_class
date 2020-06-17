package chap03.examples;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		
	String userInput = "NaN"; // string= 참조타입중에 몇가지는 기본데이터처럼 쓸수있는데 대표적인게 string
	// char은 문자 하나만 저장할수잇는데 문자여러개는 String 
	// 필드와 메소드를 가질 수 있는 객체인데, 보통 new를 써야하는데 안써도되는 대표적인것중 하나가 string
	// 스트링도 리터럴 표현방식이 잇는데 "" 안에 텍스트 넣는거

	double val = Double.valueOf( userInput ); // 아무튼 NaN이 연산이 돌기는 하니까 double로 바뀌게 됨
	
	double currentBalance = 10000.0;
	
	currentBalance += val;
	
	System.out.println(currentBalance);
	// NaN 출력 
	
}

}