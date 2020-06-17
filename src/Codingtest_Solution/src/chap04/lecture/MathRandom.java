package chap04.lecture;

public class MathRandom {
	public static void main(String[] args) {
		// Math random method
		// Math class에 속한 method로 0~1 사이의 랜덤값 출력
		// 0 <= Math.random() < 1.0 0과 같거나 크고 1보다 작은 값이 나옴
		System.out.println((int) (Math.random()*6)+1);
		
		
		
	}
}
