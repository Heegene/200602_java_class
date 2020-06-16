package chap08.examples.sec080303;

import chap08.examples.sec080205.RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl r = new SmartTelevision();
		// Remotecontrl 타입으로도 만들어서 쓸수 있음
		// 대신 Remotecontrol 안에 있는 메소드만 사용할 수 있음 
		r.turnOn();
		r.turnOff();
		r.setVolume(3);
		
		Searchable s = new SmartTelevision();
		s.search("다음");
		
		
		Searchable s2 = (Searchable) r; // 강제 형변환 하는 방법도 있음  
		// 안전하게 하려면 instanceof로 검사하고 하는 게 좋음 
		s2.search("이콩이");
		
	}

}
