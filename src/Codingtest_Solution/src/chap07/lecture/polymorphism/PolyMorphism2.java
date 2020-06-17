package chap07.lecture.polymorphism;

public class PolyMorphism2 {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		KindaCat k2 = new Tiger();
		
		// k1, k2 참조변수는 각각 cat 인스턴스, tiger 인스턴스를 가리키고 있음
		
		k1.cry(); // 참조변수의 타입이 가지고 있는 메소드가 실행되는지 인스턴스의 메소드가 실행되는지 보면
		// 인스턴스의 메소드가 실행됨(야옹~)
		// KindaCat이 아니라 Cat에서 오버라이딩된 메소드를 따른다는 것 
		k2.cry(); 
		
//		k1.walk(); // Cat에서 walk() 정의한다 하더라도 KindaCat에는 walk가 없으므로 실행시킬 수 없음 
//		집고양이에다가 걷다() 를 한다고 해도 고양이과.걷다() 라고 할 수는 없음
//		근데 울다의 경우에는 각각의 인스턴스 오버라이딩된 내용으로 실행됨 
		
		method2(k1);
		method2(k2); // 이것들도 실행 가능
		
		
	}
	
	
	public static void method2(KindaCat k) {
		// 일단 KindaCat에는 울다라는 메소드가 있는 건 보장이 됨 (상위 클래스에 울다가 있으니까)
		// 어떤 인스턴스가 들어오든 울다라는건 있음
		k.cry(); // 이건 실행 가능
		// 실행시킬 수 있는데 실제로 실행되는 건 인스턴스의 메소드가 된다는 것 
		// 상위타입으로 정의된 변수에 값을 넣을 수 있다면 하위 클래스의 인스턴스를 교체해서 넣을 수 있음
		// 어떤 참조변수에 값을 넣을때 인스턴스를 항상 같은 인스턴스를 쓰지 않아도 됨
		// 교체해서 쓸 수 있음 근데 교체할 때 하위클래스만 변경하면 되지 상위클래스를 변경할 필요가 없다는 것
		
	}
}
