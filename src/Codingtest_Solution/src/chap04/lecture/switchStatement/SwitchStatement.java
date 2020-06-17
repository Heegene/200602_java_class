package chap04.lecture.switchStatement;

public class SwitchStatement {
	public static void main(String[] args) {
		// 값에 의해서 실행 흐름을 변경하는 switch 
		// 값에 의해서 실행흐름을 변경함
		// 값의 type: byte, char, short, int, enum, String 
		// 이건 버전에 따라서 달라질 수 있으므로 이클립스 컴파일러에 의존하면됨
		
		// case 구문과 () 안의 값이 일치하는 곳부터 시작하게 됨
		// 일치하는 곳에서부터 쭉 돌리므로 하나만 하고 중단시키고 싶으면 break; 
		// case는 하나 이상 존재할 수 있음 
		
		// 아무것도 일치하는 것이 없는 경우 default 를 통해 입력 가능 
		
		int l = 2;
		switch(l) {
		
		case 3: 
			System.out.println("3입니다.");
			break;
		
		case 4: 
			System.out.println(("4입니다."));
			break;
			
		default:
			System.out.println("일치하는 값이 없습니다. ");
		
		}
	}
}
