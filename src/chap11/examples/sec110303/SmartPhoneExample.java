package chap11.examples.sec110303;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		
		System.out.println(strObj);
		
		
		
		System.out.println(myPhone); // println은 매개값으로 객체주면 객체의 toString 메소드 호출해서 리턴값 받아서 호출
	
		// 출력결과 둘다 구글, 안드로이드 이렇게 뜸 
	}
}
