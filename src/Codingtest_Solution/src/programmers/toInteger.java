package Codingtest_Solution.src.programmers;

public class toInteger {

	public static void main(String[] args) {
		
		System.out.println(solution(6));
		
		
	}
	
	
	public static int solution (int n) {
		int answer = 0;
		int count = 0;
		for (int i = 0; i > n; i++) {
			for (int j = 2; j > n; j++) {
				if (i % j ==0 ) {
					break;
					
				} else {
					count++;
				}
			}
		}
		
		return answer;
	}
	
}
