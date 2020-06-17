package chap06.examples.sec061101;

public class PersonExample {
	public static void main(String[] args) {

		Person p1 = new Person("123456-2345834", "갱얼");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; 값을 한번만 할당할 수 있으므로 다시 바꾸려 해도 안됨
//		p1.ssn = "6432544-3421341"; // 마찬가지로 변경할 수 없음 
		p1.name = "갱얼쥐";
		
		System.out.println(p1.name);
		
		

	}
}
