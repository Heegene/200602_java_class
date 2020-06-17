package myjava;

public class Test {
	public static void main(String[] args) {
		String s = "abcdefg";
		System.out.println(solution(s));

	}

	public static String solution(String s) {
		String answer = "";
		
		if ((s.length()/2)%2 == 0) {
			answer = s.substring((s.length()/2)-1,(s.length()/2)+1);
		} else {
			answer = s.substring((s.length()/2),(s.length()/2));
		}
		
		return answer;
		

	}

}
