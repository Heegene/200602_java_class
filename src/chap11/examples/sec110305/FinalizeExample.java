package chap11.examples.sec110305;

public class FinalizeExample {
	
	public static void main(String[] args) {
		Counter counter = null;
		
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			
			counter = null;
			
			System.gc(); // 유저가 실행시킬 일은 없는데
			// 인스턴스가 지워질 때 gc가 마지막으로 한 번 실행시켜주는 게 finalize() 메소드임
			// finalize() 메소드를 실행시킨 적 없는데 gc가 돌면서 이게 나타나는 것 
			// 아무튼 gc가 알아서 메모리 관리하므로 메모리 관리 직접 할 필요 없다는 게 자바의 장점
			
//			출력 결과
//			2 번 객체의 finalize가 실행되었습니다. 
//			14 번 객체의 finalize가 실행되었습니다. 
//			13 번 객체의 finalize가 실행되었습니다. 
//			12 번 객체의 finalize가 실행되었습니다. 
//			11 번 객체의 finalize가 실행되었습니다. 
//			10 번 객체의 finalize가 실행되었습니다. 
//			9 번 객체의 finalize가 실행되었습니다. 
//			8 번 객체의 finalize가 실행되었습니다. 
//			7 번 객체의 finalize가 실행되었습니다. 
//			6 번 객체의 finalize가 실행되었습니다. 
//			5 번 객체의 finalize가 실행되었습니다. 
//			4 번 객체의 finalize가 실행되었습니다. 
//			1 번 객체의 finalize가 실행되었습니다. 
//			3 번 객체의 finalize가 실행되었습니다. 
//			15 번 객체의 finalize가 실행되었습니다. 
//			16 번 객체의 finalize가 실행되었습니다. 
//			21 번 객체의 finalize가 실행되었습니다. 
//			22 번 객체의 finalize가 실행되었습니다. 
//			19 번 객체의 finalize가 실행되었습니다. 
//			20 번 객체의 finalize가 실행되었습니다. 
//			18 번 객체의 finalize가 실행되었습니다. 
//			17 번 객체의 finalize가 실행되었습니다. 
//			23 번 객체의 finalize가 실행되었습니다. 
//			24 번 객체의 finalize가 실행되었습니다. 
//			26 번 객체의 finalize가 실행되었습니다. 
	

			
			
		}
		
	}
	
	

}
