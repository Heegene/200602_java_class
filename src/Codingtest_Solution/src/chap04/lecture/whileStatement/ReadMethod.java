package chap04.lecture.whileStatement;

public class ReadMethod {
	
	public static void main(String[] args) throws Exception {
		System.out.println("입력>");
		
		int i = System.in.read(); // 사용자로부터 입력을 받는데, 입력받은 것을 바이트 단위로 읽음
		System.out.println(i);
		// 1이라는 키보드의 값과 엔터라는 바이트를 받게 됨 // 총 3개의 byte 입력
		// 1이라는 키보드의 값을 int i가 받게 됨 1이 가진 키보드 바이트 49
		// 엔터도 입력된 키보드 값이니까 입력이 되는데
		
		
		// 엔터라는 코드를 13, 10으로 순서대로 받음 
		i = System.in.read();
		System.out.println(i);
		
		i = System.in.read();
		System.out.println(i);
		
		i = System.in.read();
		System.out.println(i);
		
		
	
		// 바이트단위로 받으니 인티저로 받을 수 있음
	}

}
