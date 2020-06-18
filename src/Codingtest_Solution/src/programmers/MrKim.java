package Codingtest_Solution.src.programmers;

import java.util.Arrays;

public class MrKim {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.solution(["Jane","Kim"]);
		
		
	}



	public String solution(String[] seoul) {
		String answer = "";
		int index = Arrays.asList(seoul).indexOf("Kim");
		answer = "김서방은" + index + "에 있다";
		return answer;
		
	}
}