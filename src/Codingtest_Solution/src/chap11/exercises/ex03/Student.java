package chap11.exercises.ex03;

public class Student {
	
	private String studentNum;

	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentNum == null) ? 0 : studentNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentNum == null) {
			if (other.studentNum != null)
				return false;
		} else if (!studentNum.equals(other.studentNum))
			return false;
		return true;
	}
	
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Student) {
//			Student compare = (Student) obj;
//			if(this.studentNum == compare.studentNum) {
//				return true;
//			}
//		} return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return studentNum.hashCode();
//	} 이렇게 해도 되고 그냥 generate hashcode, equals 해도됨
	
	

}
