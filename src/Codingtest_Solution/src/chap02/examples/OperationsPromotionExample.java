package chap02.examples;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
	//  byte byteValue3 = byteValue1 + byteValue2; // int로 자동변환되어 byte로 넣을 수 없음 
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; int로 자동변환되어 char로 넣을 수 없음 
		int intValue2 = charValue1 + charValue2 ;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2); // 연산값을 다시 char로 강제 변환
		
		int intValue3 = 10; 
		int intValue4 = intValue3/4;
		System.out.println(intValue4); // int가 기본형이므로 0.5가 날아가고 2가 출력됨
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0 ; // int와 double 이 섞인 경우 double로 자동변환 
		System.out.println(doubleValue); 
		
	}
}
