package chap10.examples.sec100501;

public class TryWithResourceExample {
	
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			// read 에서 사용하고 자동으로 닫히면서 close() 메소드가 실행되었음 
			fis.read();
			
			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}

}
