package chap05.lecture;

public class ArrayCopy2 {
	public static void main(String[] args) {
		// 얕은 복사와 깊은 복사(shallow copy and deep copy)

		int[][] origin = { { 3, 4 }, { 100, 200 } };
		int[][] target = new int[origin.length][]; // origin의 length만큼 자리 마련

//		for문을 이용한 복사
		for (int i = 0; i < origin.length; i++) {
			target[i] = origin[i];
		}
// shallow copy(얕은 복사)
//		origin[0][0] = 300; // 300으로 바꾸면 target 0,0도 마찬가지로 변경됨 
		// 배열 참조값을 복사하였으므로 그 참조값에 들어있는 0번 인덱스의 값이 변경되면
		// 0번 인덱스의 아이템도 같이 교체됨 
		// 얕게 복사했다고
		// 깊은복사는 배열의 배열 아이템까지 꺼내서 복사해야한다고?? 함 
		// 이 예제가 shallow copy
		
		// deep copy(깊은 복사)
		
		for (int i = 0; i < origin.length; i++) { 
			target[i] = new int[origin[i].length]; // 공간 마련
			// 깊으 복사는 참조할 객체를 아예 별도로 생성함 
			for (int j = 0; j<origin[i].length; j++) {
				target[i][j] = origin[i][j];
			}
		}
		// 이렇게 깊은복사를 할 경우 origin[][] 을 바꾸어도 target에는 영향을 미치지 않음 
		
		origin[0][0] = 300;
		
		
		
		for (int[] n : target) {
			for (int t : n) {
				System.out.println(t); // 복사된 내용 확인 
			}
		}

	}
}
