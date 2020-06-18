package chap10.examples.sec100204;

public class ClassCastExceptionExample {

	class Animal {
	}

	class Dog extends Animal {
	}

	class Cat extends Animal {
	}

	public static void main(String[] args) {

		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
//출력결과
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	No enclosing instance of type ClassCastExceptionExample is accessible. Must qualify the allocation with an enclosing instance of type ClassCastExceptionExample (e.g. x.new A() where x is an instance of ClassCastExceptionExample).
//
//	at chap10.examples.sec100204.ClassCastExceptionExample.main(ClassCastExceptionExample.java:7)

	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}

}