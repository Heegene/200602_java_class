package chap11.examples.sec110304.shallow;

public class Member implements Cloneable { // 복제할 수 있다는 표시
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult; // 5개의 필드가 있음 
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		
	}
	
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone();
			
		}	catch (CloneNotSupportedException e) { }
		return cloned; 
	}

}
