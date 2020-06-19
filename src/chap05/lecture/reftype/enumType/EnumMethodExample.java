package chap05.lecture.reftype.enumType;

import chap05.examples.Week;

public class EnumMethodExample {
	
	public static void main(String[] args) {
		
		//name 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name); // SUNDAY 출력
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal); // 6 출력(week enum 파일에 월~일 순으로 0~6 배열처럼 만들어진것)
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY; 
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // -2
		int result2 = day2.compareTo(day1); // 2
		
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf() 메소드
		if (args.length ==1 ) { // run congif 가서 main argument에 MONDAY 이런식으로 입력해줘야함 
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요. 콩이와 2시간 산책해 주세요.");
			} else {
				System.out.println("평일이군요. 콩이와 1시간 산책해 주세요.");
			}
		}
		
		
		// values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
		
		
		
	}

}
