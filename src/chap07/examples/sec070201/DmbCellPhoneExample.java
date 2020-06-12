package chap07.examples.sec070201;

public class DmbCellPhoneExample {
	
	public static void main(String[] args) {
		
		// dmbCellphohne 객체 생성. 생성자에서 정의한 조건에 맞게 객체를 생성한다. 
		DmbCellPhone dmbp = new DmbCellPhone("자바폰", "검정", 10);
		
		// Cellphone 으로부터 상속받은 필드
		System.out.println("모델 " + dmbp.model);
		System.out.println("색상 " + dmbp.color);
		
		// DmbCellPhone의 필드
		
		System.out.println("채널 " + dmbp.channel);
	
		// CellPhone 으로부터 상속받은 메소드 호출
		
		dmbp.powerOn();
		dmbp.bell();
		dmbp.sendVoice("여보세요");
		dmbp.receiveVoice("안녕하세요 이콩이입니다.");
		dmbp.sendVoice("콩이 산책~~");
		dmbp.hangUp();
		
		// DmbCellPhone의 메소드 호출
		
		dmbp.turnOnDmb();
		dmbp.changeChannelDmb(12);
		dmbp.turnOffDmb();
		
	}
	
}
