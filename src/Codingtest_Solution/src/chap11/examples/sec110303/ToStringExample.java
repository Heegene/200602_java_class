package chap11.examples.sec110303;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		
		Object obj1 = new Object();
		
		Date obj2 = new Date();
		
		System.out.println(obj1.toString()); // java.lang.Object@15db9742
		System.out.println(obj2.toString()); // Mon Jun 15 11:38:45 KST 2020
	}
}
