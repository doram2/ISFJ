
public class Ex01 {

	public static void main(String[] args) {
		// ���� ���� 10�� ���� -> ������ 10�� ����°� �ƴϰ� ���� �ϳ��� 10���� ���� �����ϵ��� ����� = �迭
		
		int[] score = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(score[5]);
		
		//Python�� ����Ʈ�� ���� ������ �����͸� ������ ������ �� ������, JAVA�� �迭�� ������ ������ �����͸� ������ �� �ִ�.
		
		double[] d = {10.5, 10.6, 12.5, 12.6};

		//�迭�� ����� ���� indexing�� �Ѵ�.
		System.out.println(d[3]);
		
		//�迭�� ��� �����͸� ���
		for(int i = 0; i <= 3; i++) {
			System.out.println(d[i]);
		}
		
		
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += score[i];
		}
		System.out.println(sum);
	}

}
