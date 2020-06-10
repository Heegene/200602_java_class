package chap06.examples.sec060801;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1); // sum1 사용을 위해 배열을 넣음
		
		System.out.println("result 1 is " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result 2 is" + result2);
		
		
		int result3 = myCom.sum2(1,2,3); // sum2  사용을 위해 정수를 여러개 넣음 
		System.out.println("result 3 is"+ result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result 4 is"+ result4);
	}
}
