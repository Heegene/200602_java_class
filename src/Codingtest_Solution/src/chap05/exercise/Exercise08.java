package chap05.exercise;

public class Exercise08 {
	public static void main(String[] args) { //array의 length는 3
		int[][] array = { { 95, 86 }, // 0
				{ 83, 92, 96 }, // 1
				{ 78, 83, 93, 87, 88 } // 2 array[2].length는 5 ! 

		};

		int sum = 0;
		double avg = 0.0;

		// array[0][0];
		// array[0][1];
		// array[1][0];
		// array[1][1];
		// array[1][2];
		// array[2][0];
		// array[2][1];
		// array[2][2];
		// array[2][3];
		// array[2][4];
		
		int numItems = 0;
		
		
		for (int i = 0; i < array.length; i++) { // 0,1,2 이렇게 세번 반복 (총 길이가 3이므로)
			for (int k = 0; k < array[i].length; k++) { // array[0] 이면 length 2니까 0,1 이렇게 두번
				// 각 원소의 길이는 array의 i번째 길이
				System.out.println(array[i][k]); // 탐색됐는지 확인 (원소 쭉 뜸) 
				sum += array[i][k]; // 0,0 일때 95, 0,1일때 86 더해감 
				
				numItems++;  // 원소의 개수를 세기 위해 포문이 돌때마다 1씩 증가하도록 함
				avg = (double) sum / numItems; 

			}


		}
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);

	}

}
