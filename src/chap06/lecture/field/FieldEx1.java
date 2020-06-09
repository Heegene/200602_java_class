package chap06.lecture.field;

public class FieldEx1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.name); // 이름이라는 필드를 사용하고싶다 라고 하면 Student라는 클래스의 필드로 등록되어있어야함
		System.out.println(s2.name); // Student 클래스파일에서 선언하면 여기서 다 가질 수 있게 됨(해당 필드를)
		
		System.out.println(s1.age); 
		
		s1.age = 99;
		s2.age = 30;
		
		System.out.println(s1.age);
 		
	}
}
