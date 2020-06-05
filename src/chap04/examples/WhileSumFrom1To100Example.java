package chap04.examples;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while (i<=100) {
			sum += i;
			i++;
			
		}
		System.out.println("1~" + (i-1) + "합 :" + sum);
	} //i가 101이 되는 순간 false가 되는것이므로 지금 i는 101이라 -1을 해준것 
}
