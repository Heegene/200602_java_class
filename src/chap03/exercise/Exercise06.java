package chap03.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		
		//사다리꼴의 넓이 (윗변+아랫변)*높이/2
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double)lengthTop+lengthBottom)*height/2;
		System.out.println(area);
	}
}
