
public class Ex15 {

	public static void main(String[] args) {
		WEEK1 today = WEEK1.�����;
		System.out.println(today); //������ ���
		
		String name = today.name(); //������ ����� ���ڿ��� ����ȯ
		System.out.println(name);

		//������ ����� ������ �ִ� �������� ������ ����
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		WEEK1 day1 = WEEK1.�����;
		WEEK1 day2 = WEEK1.ȭ����;
		
		int result = day1.compareTo(day2); //day1�� day2�� ��
		System.out.println(result);//������� ȭ���Ͽ��� 2�� ����
		result = day2.compareTo(day1); //day2�� day1�� ��
		System.out.println(result);//ȭ������ ����Ͽ��� 2�� ��
		
		//�������� ���������� ��ȯ
		String day = "������";
		WEEK1 weekDay = WEEK1.valueOf(day);
		System.out.println(weekDay);
		
		//�������� �ִ� ��� ����� ��������
		WEEK1 day3 = WEEK1.�ݿ���;
		//������ �������� ������ ��� �ϳ��� ���� �� �ִ�.
		WEEK1[] days = WEEK1.values();
		for(WEEK1 w : days) {
			System.out.print(w+" ");
		}
	}

}