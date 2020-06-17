package chap05.examples;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = {83,90,87};
		
		int sum = 0;
		for (int i=0; i<scores.length; i++) { // length property를 이용해 길이까지 지정해서 직접 길이 입력할 필요 없이 카운터변수 가능 
			sum += scores[i];
		}
		System.out.println("총합" +  sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 " + avg);
		
	}
}
