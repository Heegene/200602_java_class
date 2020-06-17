package chap04.examples;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception{
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if (keyCode!=13 && keyCode!= 10) {
				System.out.println("--------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("--------------------------");
				
				System.out.println("선택 : ");
			}
			keyCode = System.in.read();
			
			if (keyCode == 49) { // 1을 입력하는 경우 49,13,10 따란 
				speed++; // speed를 1 증가시킴 
				System.out.println("현재 속도=" + speed); // 현재 speed 값 출력
			} else if (keyCode == 50) { // 2를 입력하는 경우
				speed--; // speed를 1 감소시킴 
				System.out.println("현재 속도=" + speed); // 현재 speed 값 출력
			} else if (keyCode == 51 ) { // 3을 입력하는 경우
				run = false; // while 문을 종료함. (while문의 조건이 (run) 이었고 앞에서 run은 true로 초기값 세팅되어 있었음)
			}
				
		}
		
		System.out.println("프로그램 종료"); // while문을 빠져나가면 프로그램 종료 메시지를 출력 
	}
}
