package chap07.examples.sec070803;

public class PhoneExample {
	public static void main(String[] args) {
		
		// Phone ph = new Phone(); // Phone이 abstract class 이므로 사용불가 
		
		SmartPhone smp = new SmartPhone("이콩이");
		
		smp.turnOn();
		smp.internetSearch();
		smp.turnOff();
	}
}
