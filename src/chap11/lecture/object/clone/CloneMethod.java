package chap11.lecture.object.clone;

public class CloneMethod {
	public static void main (String[] args) throws Exception {
		MyClass c1 = new MyClass();
		
		c1.setId(99);
		c1.setName("Java");
	
		// 이걸 c2 복사하고싶다면
		
		MyClass c2 = new MyClass();
		c2.setId(c1.getId());
		c2.setName(c1.getName()); // 이렇게 복사하는 방법이 있는데 필드별로 해야 함
		
		System.out.println(c1.hashCode()); 
		System.out.println(c2.hashCode());
		
//		c1과 c2는 서로 참조값이 다름(다른 해시값 가짐)
//		위의 과정을 한번에 할 수 있는 게 clone() 메소드
		
		MyClass c3 = c1.copy();
		System.out.println(c3.getId()); // 99 출력 
		System.out.println(c3.getName()); // Java 출력
		// 근데 복사를해서 내용물은 같은데 참조값이 같은 것은 아님
		// 이렇게 복사하는 게 clone 
		
		c1.setArr(new int[] {3,4}); // 이렇게 있을 때
		c1.getArr()[0] = 300; 
		System.out.println(c3.getArr()[0]);
		System.out.println(c3.getArr()[1]);
		
		
		
	}
}
