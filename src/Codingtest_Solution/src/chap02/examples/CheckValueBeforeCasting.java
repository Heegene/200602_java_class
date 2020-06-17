package chap02.examples;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		if ( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) { // 128보다 작거나 127보다 큰 경우 아래의 두 문장 출력
			System.out.println("byte 타입으로 변환할 수 없습니다."); 
			System.out.println("값을 다시 확인해 주세요.");
			
		}	else {
			byte b = (byte) i; // 위의 if문 조건에 해당하지 않으면 int - byte로 강제 형변환 실행
			System.out.println(b);
		}
	}
}
