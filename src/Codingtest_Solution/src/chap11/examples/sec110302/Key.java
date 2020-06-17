package chap11.examples.sec110302;

public class Key {
	
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			
			if(this.number == compareKey.number) {
				// 두개의 인스턴스를 확인해서 number가 같다면 같은 instance로 판단 
				return true; 
			}
		} return false; 
	}

	
	
}
