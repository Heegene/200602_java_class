package chap05.examples;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90,87} ; // 새로운 integer 배열 인스턴스 생성하고 scores에 참조값이 들어감 
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 = " + sum1);
		
		int sum2 = add (new int[] {83,90,87}); // 새로운 integer 배열 인스턴스가 만들어짐 그러면서 참조값이 생성됨 
		System.out.println("총합 : " + sum2);
		System.out.println();
		
		
	}
	
	public static int add(int[] scores) { // 참조값이 넘어가게 됨 add int[] 987 이런식
		int sum = 0;
		for(int i=0; i<3; i++) { // 각각의 값을 컨택해서 더하게 되는 것 
			sum += scores[i];
		}
		return sum;
	}
	
	
	
}
