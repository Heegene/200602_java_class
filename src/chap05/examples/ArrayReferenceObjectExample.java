package chap05.examples;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java"; // string lietral 새로운 인스턴스 만들어짐
		strArray[1] = "Java"; // string literal이 동일할 경우 인스턴스 재활용할것이므로 같은 참조값 가짐
		strArray[2] = new String("Java"); // 새롭게 만들어서 넣는 경우 재활용X
		
		System.out.println(strArray[0] == strArray[1]); // true 참조값이 같으므로 재활용되어 true
		System.out.println(strArray[0] == strArray[2]); // false 
		System.out.println(strArray[0].equals(strArray[2])); // true 내용물만 비교함 
		
	}
}
