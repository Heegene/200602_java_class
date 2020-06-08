package chap05.exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		int max = 0;
		double avg = 0;
		int sum = 0;

		while (run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------------------");
			System.out.println("선택 >");

			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = sc.nextInt();
				scores = new int[studentNum]; // 3개의 학생수를 가진 배열이 되었음

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {

					System.out.print("scores[" + i + "]: ");
					scores[i] = sc.nextInt(); // 각 배열에 값을 저장했음

				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}

			} else if (selectNo == 4) {
				for (int i = 0; i < studentNum; i++) {
					if (scores[i] >= max) {
						max = scores[i]; // 최고점수
					}
				}
				for (int k = 0; k < scores.length; k++) {
					sum += scores[k]; // 합산 점수

				}

				avg = (double) sum / scores.length; // 평균점수

				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);

			} else if (selectNo == 5) {
				run = false;

			}
		}
		System.out.println("프로그램 종료");

	}
}
