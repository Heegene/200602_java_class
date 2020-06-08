package chap05.lecture;

public class ArrayRefType {
	public static void main(String[] args) {
		// 이렇게 세 가지 방식으로 배열을 선언할 수 있음 
		int[] arr1 = { 3,4,5 }; // new 생략하는 건 선언과 동시에 값을 넣어줄 때만 가능 그 이후에 값 넣으려면 무조건 new 필요
		int[] arr2 = new int[] {6,7,8};
		int[] arr3 = new int[3]; //크기만 먼저 할당해 두는 경우 
		
	}
}
