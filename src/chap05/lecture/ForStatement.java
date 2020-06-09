package chap05.lecture;

public class ForStatement {
	public static void main(String[] args) {
		int[] array = { 5, 6, 7, 8, 9};
		for (int i = 0; i < array.length; i++) {
			// 이런류의 for문이 매우 자주 사용되므로 간단하게 사용할 수 있는 방법 생김
			System.out.println(array[i]);
		}
		System.out.println();
		
		for (int a : array) { // 각 아이템이 변수에 한번씩 들어가면서 for문이 실행됨
			// for (자료타입 임의의 변수명 : 배열명) 으로 가능 
			System.out.println(a);
		}
		
		String[] array2 = { "콩이", "충북이", "호두"};
		for (String b : array2) {
			System.out.println(b);
		}
		
		
		
	}
}
