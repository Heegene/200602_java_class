package Codingtest_Solution.src.programmers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class year_2016 {

	public static void main(String[] args) {

		try {
			System.out.println(getDateDay("20200618", "yyyyMMdd"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static String getDateDay(String date, String dateType) throws Exception {

		String day = "";

		SimpleDateFormat df = new SimpleDateFormat(dateType); // 인스턴스 생성
		Date nDate = df.parse(date); // date 부분 잘라냄

		Calendar cal = Calendar.getInstance();
		cal.setTime(nDate);// nDate 기준으로 날짜 변경

		int dayNum = cal.get(Calendar.DAY_OF_WEEK); // Calendar로부터 요일상수 받음

		switch (dayNum) { // daynum 1=일요일 2=월요일 ...
		case 1:
			day = "일요일";
			break;
		case 2:
			day = "월요일";
			break;
		case 3:
			day = "화요일";
			break;
		case 4:
			day = "수요일";
			break;
		case 5:
			day = "목요일";
			break;
		case 6:
			day = "금요일";
			break;
		case 7:
			day = "토요일";
			break;
		}

		return day;

	}

}
