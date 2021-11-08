import java.util.Calendar;

public class Ex14 {

	public static void main(String[] args) {
		WEEK today;//열거형 상수 자료형
		today = WEEK.MONDAY;
		System.out.println(today);
		
		//사용 예
		Calendar cal = Calendar.getInstance();//날짜를 사용하기 위한 자료형
		
		//요일을 가지고오자.
		int week = cal.get(Calendar.DAY_OF_WEEK); //Calender자료안에 있는 상수. 요일을 가져옴
		System.out.println(week); //월요일: 2
		
		switch(week) {
		case 1: today = WEEK.SUNDAY; break;
		case 2: today = WEEK.MONDAY; break;
		case 3: today = WEEK.TUESDAY; break;
		case 4: today = WEEK.WEDNESDAY; break;
		case 5: today = WEEK.THURSDAY; break;
		case 6: today = WEEK.FRIDAY; break;
		case 7: today = WEEK.SATURDAY; break;
		}
		System.out.println("Today is "+today);
		
		if(today == WEEK.SUNDAY) {
			System.out.println("나는 놀러가요");
		}
		else {
			System.out.println("열심히 일해요");
		}
		
	}

}
