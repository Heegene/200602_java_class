package chap03.exercise;

public class Exercise03 {
	
	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result); // '가' 출력 90점보다 점수가 높지 않은 것이 맞으므로 true라 가
		
		
	}

}
