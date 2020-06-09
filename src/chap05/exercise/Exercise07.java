package chap05.exercise;

public class Exercise07 {
	
	public static void main(String[] args) {
//		int max = 0;
//		int min = 0;
//		int[] array = { -1, 5, -3, 8, 2,0};
//	
//		for (int i = 0; i < array.length; i++) { // 일단 모두 탐색함 
//			if (array[i] >= max) { // array[i] 보다 max 값이 작으면 
//				max = array[i]; // max에 array[i]값 대입하고 다음 카운터로 넘어가 반복 
//			
//			}
//			if (min > array[i]) {
//			 min = array[i];
//			}
//		}
		
		int [] arr = {-1, 3, 5, 10, 58, -34};
		int max = 0;
		int min = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				
			}
			if (arr[i] < min) {
				min = arr[i];
		
			}
			
		}
		
		
		
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		
		
	}

}
