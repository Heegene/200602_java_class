package chap11.examples.sec111204;

public class ValueCompareExample {
	
	public static void main(String[] args) {
		
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("== 결과" + (obj1 == obj2)); // false 참조값이 다름
		System.out.println("언박싱 후 == 결과: " + (obj1.intValue() == obj2.intValue())); // true
		System.out.println("equals() 결과" + obj1.equals(obj2)); // true
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== 결과" + (obj3 == obj4)); // true 이땐 맞게갖고왔음..이럴때도있고 저럴때도있고 일관성X 
		System.out.println("언박싱 후 == 결과: " + (obj3.intValue() == obj4.intValue())); // true
		System.out.println("equals() 결과" + obj4.equals(obj4)); // true
		
		// == 연산자와 != 연산자는 포장객체에 어떤 값 들어가있는지 모르면 사용하지 말기
		// 언박싱해서 비교하거나 equals를 사용해서 비교하는 것이 좋음
		
		// 부등호연산을 하고싶으면 compareTo 연산을 하면 됨
		System.out.println(obj3.compareTo(obj4)); // 둘이 같으므로 0이 나옴 
		
		
	}

}
