package chap05.examples;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i=-0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]);
			// 1, 2, 3, 0, 0 출력 길이 5인데 3개만 복사되었으므로 
		}
	}
}
