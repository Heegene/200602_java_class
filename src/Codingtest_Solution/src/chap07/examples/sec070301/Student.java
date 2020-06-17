package chap07.examples.sec070301;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자 호출 (parameter 없는 생성자가 없으므로 명시적으로 써줘야 함)
		// 자기 자신의 필드에 할당하기 위한 코드를 직접 작성하지 않고 상위 클래스의 name, ssn을 그대로 사용하기 위해
		//		super(name,ssn) 해준거
		//		this.name = name;
		//		this.ssn = ssn;  위 두문장의 뜻을 내포하고 있음 
		this.studentNo = studentNo;
		
	}
}
