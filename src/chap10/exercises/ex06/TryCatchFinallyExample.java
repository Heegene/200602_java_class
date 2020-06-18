package chap10.exercises.ex06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		
		for (int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
			}
			// 0일때 10 / 1일때 숫자변환ㄴㄴ / 2일때 인덱스를 초과했음 
		}
	}
}

//실행결과
//10
//숫자로 변환할 수 없음
//10
//인덱스를 초과했음
//10
