
public class Ex02 {

	public static void main(String[] args) {
		//�迭 �����
		//[]������: �迭�� ��Ÿ����
		int i[] = {10,20,30};
		
		int i1 [];
		i1 = new int [] {10,20,30};
		
		int i2 [] = new int[3];
		i2[0] = 10;
		i2[1] = 20;
		i2[2] = 30;
		
		int i3[];
		i3 = new int[3];
		i3[0] = 10;
		i3[1] = 20;
		i3[2] = 30;
		
		/*���Ұ�
		 * int i4[];
		 * i4 = {10,20,30};
		 */
		
		int i5[];			//		  0   1   2
		i5 = new int[3];	// i5 = |	|	|	|
		//�迭 ���� �� �� ��Ұ� 0���� �ʱ�ȭ�ȴ�
		System.out.println(i5[0]);
		System.out.println(i5[1]);
		System.out.println(i5[2]);
	}

}
