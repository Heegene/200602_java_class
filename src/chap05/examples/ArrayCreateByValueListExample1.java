package chap05.examples;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87} ;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i]; // 배열은 for문과 함께 잘 사용됨 for 문의 카운터변수 활용하여
			// 각 배열의 원소를 지정하기 좋음 
			
		}
		System.out.println("총합 :" +  sum);
		double avg = (double) sum / 3;
		System.out.println("평균 :" + avg);
		
	}
}
