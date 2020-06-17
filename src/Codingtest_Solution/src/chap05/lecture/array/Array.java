package chap05.lecture.array;

public class Array {
	public static void main(String[] args) {
		// 배열 선언 후에 값을 할당할 때
		int[] arr5; 
//		arr5 = {2,5,2,1};
		
//		이렇게 줄 수 없음
//		new 라는 연산자와 타입키워드 같이 써줘야함 
		arr5 = new int[] {2,5,2,1};
//		그럼 배열에 공간만 마련하고 값이 정해지지 않았을 때에는
//		배열의 크기만 정해둘 수 있음
		int[] arr6;
		arr6 = new int[5]; // 배열의 크기를 마련함. 이렇게 되면 0번 인덱스부터 4번 인덱스까지 5개의 공간 마련됨 
//		이렇게 되면 초기값이 저장됨 int type 배열의 경우 0 이런식
//		근데 boolean type의 경우 0이라는 값이 존재할 수 없으므로 초기값이 false로 저장되어 있음 
//		참조 타입일 경우
		String[] arr8;
		arr8 = new String[3]; // 가리키는 값이 없으면 null로 초기화되어있음 
		
		
		
	}
}
