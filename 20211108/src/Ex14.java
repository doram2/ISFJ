import java.util.Calendar;

public class Ex14 {

	public static void main(String[] args) {
		WEEK today;//������ ��� �ڷ���
		today = WEEK.MONDAY;
		System.out.println(today);
		
		//��� ��
		Calendar cal = Calendar.getInstance();//��¥�� ����ϱ� ���� �ڷ���
		
		//������ ���������.
		int week = cal.get(Calendar.DAY_OF_WEEK); //Calender�ڷ�ȿ� �ִ� ���. ������ ������
		System.out.println(week); //������: 2
		
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
			System.out.println("���� �����");
		}
		else {
			System.out.println("������ ���ؿ�");
		}
		
	}

}
