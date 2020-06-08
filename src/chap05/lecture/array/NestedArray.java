package chap05.lecture.array;

public class NestedArray {
	
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 5};
		int[] arr2 = {6, 7, 8};
		
//		배열의 배열이 만들어지는 경우
//		각 아이템의 타입이 integer 배열인 경우
		int[][] arr4;
		int[][][][] arr;
//		배열인데 배열의 원소가 배열인 것
		
		arr4 = new int[][] {arr1, arr2};
//		integer 배열의 배열 구성
//		이 경우 arr1, arr2, arr4가 저장될 수 있는 공간이 stack 영역에 마련됨
//		heap에 arr1,arr2 값이 들어가고 JVM이 참조값(주소)을 부여함 ex 963, 852 
//		arr4는 참조 타입이므로 마찬가지로 인스턴스가 만들어지는데, heap 영역에 963, 852 라는 참조값을 원소로 한 인스턴스 생성
//		그리고 JVM이 이 963,852가 들어간 인스턴스에 참조값을 주고(ex 712) 그리고 그 712라는 참조값을 arr4가 갖게 됨 
//		이때 arr4[0].length는 3이 됨(arr1이니까)
		int[] arr3 = arr2; 
		arr4[1][1] = 200;
		System.out.println(arr3[1]); // 이러면 200 나옴 
		
		
		
		
		
	}

}
