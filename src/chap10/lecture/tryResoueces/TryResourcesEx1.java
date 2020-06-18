package chap10.lecture.tryResoueces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryResourcesEx1 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt");
			FileOutputStream fos = new FileOutputStream("file2.txt");) {
			 // 이렇게 동시에 생성하면 fis.close() 이걸 안해줘도 try 블럭 끝나고나면 알아서 닫힘 
		} catch (IOException e) { // filenotfound는 IO에서 다형성으로 한번에 받아줄 수 있음
			// Java 7부터는 이런 식으로 사용하면 됨 
		}
		
		}
	
	
	}

