package chap03.examples;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철"; 
		String strVar2 = "신민철";
		String strVar3 = new String ("신민철"); // var 1,2와 다른 참조값을 가지고있음 
		
		System.out.println( strVar1 == strVar2); // true
		System.out.println( strVar1 == strVar3); // false 참조값이 다르므로 
		System.out.println("---------------------------");
		System.out.println( strVar1.equals(strVar2)); //true
		System.out.println( strVar1.equals(strVar3)); // true  안의 데이터 내용물만 비교하므로 true  
		
	}
}
