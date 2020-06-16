package chap08.lecture.interfaceKeyword;

public class MyApp {
	public static void main(String[] args) {
		
		Malamute mal = new Malamute();
		Cat cat = new Cat();
		
		KindaDog kd = mal;
		KindaCat kc = cat;
		
//		Pet p1 = kd; // 개과는 애완동물이 아니니까 이게 안됨 
		Pet p1 = mal; // 말라뮤트는 펫이 맞으니까 이건 가능
		
		Pet p2 = cat;
		
		p1.sit(); // 말라뮤트에 적용한것
		p2.sit(); // 고양이에 적용한것
		
//		p2.howl(); // 이건 애완동물에 있는 기능이 아니므로 안됨 
//		p3.cry();  // 이것도 애완동물에 있는 기능이 아니므로 안됨
		
		SledDog sd = mal; // 말라뮤트의 형변환이 자동적으로 이뤄짐
		sd.pull(); 
		// 강제 형변환도 마찬가지로 가능함
		
		// 아래 타입은 다 true가 나옴 말라뮤트이면서 개과이면서 애완동물이면서 썰매견임
		System.out.println(p1 instanceof Malamute);
		System.out.println(p1 instanceof KindaDog); 
		System.out.println(p1 instanceof Pet); // 이 타입으로쓰게되면 앉아기능만쓸수있고 
		System.out.println(p1 instanceof SledDog); // 이타입으로쓰면 썰매견만쓸수있고 
		
		//상속이 가진 특성을 그대로 받음 
	}
}
