package chap05.examples;

public class ArrayInArrayExample {
	public static void main(String[] args) {
//		다차원 배열을 선언하는 여러 방법
		
		int[] [] mathScores = new int[2][3]; //원소는 2개인데 각 item이 가질 수 있는 integer는 3개 
//		즉 mathScores의 length는 2
//		각 mathScores의 0번 아이템의 길이는 3
//		0번 아이템에 [0] [1] [2] 이렇게 3개 
//		배열의 배열을 선언만 함 
		for (int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"] ["+k+"] = "+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
//		배열의 배열 형태 
//		원소가 2개 들어갈 수 있는데 각 원소의 크기가 정해지지 않았음 
//		englishScores의 length는 2
//		그런데 각 원소의 type이 integer 배열 타입이라 (각 아이템이 참조타입이면 기본값이 null일텐데) 
//		englishScores[0] 출력하면 null이라고 나옴
//		1번 인덱스도 null 
//		공간은 마련되어 있는데 값이 없어서 초기값 null 
//		새로운 integer를 할당해줌 

		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
//		인스턴스에 참조값을 넣음 
//		실제 객체는 new int[2] 인데 englishScores[0]도 객체라고들 함
		for (int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishscores["+i+"]["+k+"] = "+englishScores[i][k]);
			} // 이중포문으로 값을 확인해 보면 0이 들어있음 (초기값) 
		}
		System.out.println();
//		배열을 선언하면서 값을 한 번에 넣은 케이스
		int[][] javaScores = { {95,80}, {92,96,80} };
//		javascores의 length는 2인데 1번인덱스의 배열이 2 2번인덱스의 배열이 3인것
		
		for(int i=0; i<javaScores.length;i++) {
			
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]=" + javaScores[i][k]);
			}
		}
		
		
	}
}
