package chap07.examples.sec070804;

public class AnimalExample {
	public static void main(String[] args) {
		
		Dog KongE = new Dog();
		Cat Noah = new Cat();
		
		KongE.sound();
		Noah.sound();
		
		System.out.println("----------");
		
		// 변수의 자동 타입 변환
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("---------------------");
		
		
		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
		
	}
	
	public static void animalSound(Animal animal) { // new Dog(), new Cat()이 자동타입변환되어서 들어감 
		animal.sound(); // 재정의된 메소드 호출 
	}
}


// 출력 결과
//왈왈!!!!!
//애옹~~~~
//----------
//왈왈!!!!!
//애옹~~~~
//---------------------
//왈왈!!!!!
//애옹~~~~
