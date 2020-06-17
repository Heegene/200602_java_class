package chap04.lecture.breakcontinue;

public class BreakContinue {
	public static void main(String[] args) {
		// break;
		// 가장 가까운 loop를 빠져나감 그 loop만 빠져나감
		
		for (int i = 0; i < 10; i++) {
			System.out.println("실행문");
			if (i == 5) {
				break; // 0,1,2,3,4,5 에서 break 만나서 가장 가까운 loop인 for를 만나서 종료됨 
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++ ) {
				if (j == 3) {
					break; // j는 2까지만 실행됨 
				}
				System.out.println(i + "," + j);
			}
		}
		
		// continue; 
		// 가장 가까운 loop의 조건으로 실행흐름을 이동
		
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue; // 3일때는 continue 문을 만나 다시 조건(이경우는 for문) 으로 돌아감
				// 위로 다시 올라가므로 3일때는 3이 출력되지 않음
				// 
			}
			System.out.println(i); 
		}
	}
}
