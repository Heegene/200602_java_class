package chap11.examples.sec111203;

public class StringToPrimitiveValueExample {
	
	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("10"); // 텍스트를 기본타입으로 변환
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		int value4 = Integer.valueOf("20"); 
		
		
		System.out.println("value 1 is " + value1);
		System.out.println("value 2 is " + value2);
		System.out.println("value 3 is " + value3);
		
	}

}
