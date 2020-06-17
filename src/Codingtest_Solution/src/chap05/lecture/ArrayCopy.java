package chap05.lecture;

public class ArrayCopy {
	public static void main(String[] args) {
		int [] origin = { 3, 4, 5, 6, 7, 8};
		int[] target = new int[origin.length]; // 복사하기위해 origin의 length 만큼 새로운 배열 선언 
		
		int[] target2 = new int[origin.length];
		
		for (int i = 0; i <origin.length; i++) { // origin length 만큼 카운터
			target[i] = origin[i]; // target의 i번째에 origin[i]를 대입 
		}
		
		for (int i= 0; i <target.length; i++) {
			System.out.println(target[i]);
		}
		
		System.arraycopy(origin, 0, target2, 0, origin.length);
		// 원본배열명, 복사 시작할 위치[n], 목적지(대상 배열명), 복사본의 시작위치[n], 총 길이(0부터 끝까지할거면 origin.length)
		
		for (int i= 0; i <target2.length; i++) {
			System.out.println(target2[i]);
		}
	}
}
