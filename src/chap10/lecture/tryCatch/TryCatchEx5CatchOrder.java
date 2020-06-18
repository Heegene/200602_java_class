package chap10.lecture.tryCatch;

public class TryCatchEx5CatchOrder {
	public static void main(String[] args) {
		
	try {
		;;;;
		// exception instance의 타입을 순서대로 확인함
		// 따라서 해당되는게 나타나면 그것만 실행하고 다음 실행흐름으로 넘어감
		// 첫번째 만나는 타입에서 블럭을 실행하고 넘어가게 딤
		
	} catch (ArrayIndexOutOfBoundsException e) { 
		;;;;
	} catch (IllegalArgumentException e) { // 얘가 numberformatexception의 상위이므로(다형성에 의해  numberformat에 잡힘)
		
	} catch (NumberFormatException e) { // 여기로 넘어갈 일 자체가 없는 것 그래서 컴파일에러 발생
		;;;;
	} catch (RuntimeException e ) { // 상위클래스일수록 아래쪽으로 작성할 것 (상속관계를 잘 생각할 것) 
		;;;;
		;;;;
		
	}
	
	
	
	}
	
}
