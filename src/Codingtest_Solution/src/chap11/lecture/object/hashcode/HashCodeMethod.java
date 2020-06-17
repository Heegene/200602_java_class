package chap11.lecture.object.hashcode;

public class HashCodeMethod {
	
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode()); // hash 값 나옴 366712642
		System.out.println(c2.hashCode()); // hash 값 나옴 1829164700
		// --> 두개의 해시코드가 서로 다름!! 좋지 않음
		// 해시코드는 서랍같은거라 같은 해시코드라도 다른 객체일 수 있음
		
		
		// hashcode도 오버라이드해서써야함 
		
		String s1 = "Java";
		String s2 = new String("java");
		System.out.println(s1 == s2); // 이렇게만 하면 false 나옴
		
		// 실제 내용물이 같은지를 보는 equals method를 보면
		System.out.println(s1.equals(s2)); // 같다고 나오면 hashcode 가 꼭 같아야 함 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
